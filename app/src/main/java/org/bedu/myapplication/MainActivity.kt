package org.bedu.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.bedu.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener(){
            binding.textView.text = "Soy tu padre"
            binding.imageView.setImageResource(R.drawable.ic_baseline_whatshot_24)
        }
    }
}