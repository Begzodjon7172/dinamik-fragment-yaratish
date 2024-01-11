package com.example.dinamikfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dinamikfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val blankFragment = BlankFragment()
        val blankFragment2 = BlankFragment2()

        binding.apply {

            btnAdd.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .add(R.id.container, blankFragment)
                    .addToBackStack("begzodjon")
                    .commit()
            }

            btnRemove.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .remove(blankFragment)
                    .commit()
            }

            btnHide.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .hide(blankFragment)
                    .commit()
            }

            btnShow.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .show(blankFragment)
                    .commit()
            }

            btnReplace.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, blankFragment2)
                    .addToBackStack("salom")
                    .commit()
            }

        }

    }
}