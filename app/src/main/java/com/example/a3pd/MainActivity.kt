package com.example.a3pd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.R.id.edit
import android.content.Context
import android.content.SharedPreferences
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAktivitate2 = findViewById<Button>(R.id.btnAktivitate2)
        btnAktivitate2?.setOnClickListener {
            val intent = Intent(this, Aktivitate2::class.java)
            startActivity(intent)
        }

        val btnSaglabat = findViewById<Button>(R.id.btnSaglabat)
        btnSaglabat?.setOnClickListener {
            val editor = getSharedPreferences("name", Context.MODE_PRIVATE).edit()
            editor.putString("name", editText.getText().toString())
            editor.apply()
        }

    }

}
