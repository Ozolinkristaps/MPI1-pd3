package com.example.a3pd

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_aktivitate2.*

class Aktivitate2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aktivitate2)

        val btnAktivitate2 = findViewById<Button>(R.id.btnAktivitate1)
        btnAktivitate2?.setOnClickListener {
            finish();
        }

        val btnNolasit = findViewById<Button>(R.id.btnNolasit)
        btnNolasit?.setOnClickListener {
            val userName = getSharedPreferences("name", Context.MODE_PRIVATE).getString("name", "")
            editText2.setText(userName)
        }
    }
}
