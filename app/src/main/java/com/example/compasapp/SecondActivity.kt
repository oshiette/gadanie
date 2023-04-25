package com.example.compasapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.compasapp.databinding.ActivityMainBinding
import com.example.compasapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tv1.setOnClickListener {
            binding.tv1.text = getPreds()
        }
    }
    private fun getPreds(): String{
        return resources.getStringArray(R.array.preds)[randomNum()]
    }
    private fun randomNum(): Int{
        val size = resources.getStringArray(R.array.preds).size - 1
        return (0..size).random()
    }
}