package com.example.zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val show = findViewById<Button>(R.id.show_btn);
        val unblck = findViewById<Button>(R.id.odblokuj)
        val wiek =  findViewById<EditText>(R.id.Imie).toString().toInt()

        val man = findViewById<RadioButton>(R.id.men)
        val woman = findViewById<RadioButton>(R.id.kobieta)
        val sport = findViewById<CheckBox>(R.id.Sport)
        val gry = findViewById<CheckBox>(R.id.Gry)
        val muzyka = findViewById<CheckBox>(R.id.Muzyka)
        val tur = findViewById<CheckBox>(R.id.Turystyka)
        var wyniki = findViewById<TextView>(R.id.Wyniki)


        show.setOnClickListener{
            //Płeć
            if (man.isChecked){
                wyniki.append("męzczycna\n")

            }
            if (woman.isChecked){
                wyniki.append("Kobieta\n")
            }
            //wiek
            wyniki.append(wiek.toString()+"Lat\n")
            wyniki.append("Hobby\n")
            //Zainteresowania
            if (gry.isChecked){
                wyniki.append("-Gry\n")
            }
            if (muzyka.isChecked){
                wyniki.append("-Muzyka\n")
            }
            if (tur.isChecked){
                wyniki.append("-Turystyka\n")
            }
            if (sport.isChecked){
                wyniki.append("-Sport\n")
            }



            //Blokowanie

            woman.isEnabled = false
            man.isEnabled = false
            //wiek.isEnabled = false
            sport.isEnabled = false
            gry.isEnabled = false
            muzyka.isEnabled = false
            tur .isEnabled = false



        }

        unblck.setOnClickListener {
            woman.isEnabled = true
            man.isEnabled = true
            wiek.isEnabled = true
            sport.isEnabled = true
            gry.isEnabled = true
            muzyka.isEnabled = true
            tur.isEnabled = true

        }
    }
}