package com.test.viewmodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.test.viewmodule.databinding.DummyViewBinding

class Test : AppCompatActivity() {

    private lateinit var binding: DummyViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DummyViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
