package org.bedu.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import org.bedu.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener(){
            binding.textView.text = "I am your Mother"
            val image = binding.imageView
            Picasso.get().load("https://www.vectoresparaestampar.com/wp-content/uploads/2021/05/Yo-soy-tu-padre.jpg").into(image)
        }
    }
}