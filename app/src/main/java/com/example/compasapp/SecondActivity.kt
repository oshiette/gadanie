package com.example.compasapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.compasapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    lateinit var but: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        but = findViewById(R.id.imbt)
        but.setOnClickListener {
            intent
            finish()
        }
        binding.tv1.setOnClickListener {
            binding.tv1.text = getPreds()


        }

        fun onBack() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
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