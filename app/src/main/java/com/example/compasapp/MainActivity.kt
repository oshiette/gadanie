package com.example.compasapp

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import com.example.compasapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var mediaPlayer: MediaPlayer

    lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        button = findViewById(R.id.bt)
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
            val playButton = findViewById<Button>(R.id.btnMusic)
            playButton.setOnClickListener {
// Если mediaPlayer уже проигрывает музыку, остановить ее и вернуться к началу
                if (mediaPlayer.isPlaying) {
                    mediaPlayer.pause()
                    mediaPlayer.seekTo(0)
                } else {
                    // Иначе начать проигрывание музыки
                    mediaPlayer.start()
                }
            }
            // Загрузка музыки из папки res/raw
            mediaPlayer = MediaPlayer.create(this, R.raw.music)

        fun onDestroy() {
            super.onDestroy()
            mediaPlayer.release()
        }

        val playButton2 = findViewById<Button>(R.id.playBtn)

        playButton2.setOnClickListener {
            val intent = Intent(this, VideoActivity::class.java)
            startActivity(intent)
        }
    }
    }


