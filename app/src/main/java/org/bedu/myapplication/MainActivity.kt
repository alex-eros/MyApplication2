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

        var count =0

        binding.btn1.setOnClickListener(){
            when(count){
                0 -> {
                    binding.textView.text = "I am your Father"
                    val image = binding.imageView
                    Picasso.get().load("https://www.vectoresparaestampar.com/wp-content/uploads/2021/05/Yo-soy-tu-padre.jpg").into(image)
                    count ++
                }
                1->{
                    binding.textView.text = "I am your Girlfriend / Kiss me"
                    val image = binding.imageView
                    Picasso.get().load("https://pornpics.app/pics/onlyteenblowjobs/annabel-redd-jon-rogue/race-redhead-sexcom/annabel-redd-jon-rogue-4.jpg").into(image)
                    count ++
                }
                2 -> {
                    count =0
                }
            }
        }
    }
}
