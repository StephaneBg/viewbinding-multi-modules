package com.test.viewbindingmultimodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.test.viewbindingmultimodule.databinding.ActivityMainBinding
import com.test.viewmodule.databinding.DummyViewBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dummyView = DummyViewBinding.inflate(layoutInflater)
        binding.container.addView(dummyView.root)
    }
}
