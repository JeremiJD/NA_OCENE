package com.example.zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val show = findViewById<Button>(R.id.show_btn);
        val unblck = findViewById<Button>(R.id.odblokuj)
        val wiek =  findViewById<EditText>(R.id.Imie)
        val man = findViewById<RadioButton>(R.id.men)
        val woman = findViewById<RadioButton>(R.id.kobieta)
        val sport = findViewById<CheckBox>(R.id.Sport)
        val gry = findViewById<CheckBox>(R.id.Gry)
        val muzyka = findViewById<CheckBox>(R.id.Muzyka)
        val tur = findViewById<CheckBox>(R.id.Turystyka)
    }
}