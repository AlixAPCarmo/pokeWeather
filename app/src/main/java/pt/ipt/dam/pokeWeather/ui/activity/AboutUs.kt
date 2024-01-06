package pt.ipt.dam.pokeWeather.ui.activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import pt.ipt.dam.pokeWeather.R

class AboutUs : AppCompatActivity() {

    private lateinit var btnReturn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)

        btnReturn = findViewById(R.id.returnBtn)
        btnReturn.setOnClickListener {
            val intent = Intent(this, PokeWeatherActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}