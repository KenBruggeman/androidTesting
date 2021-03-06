package com.example.hier

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.hier.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide();
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //setContentView(R.layout.login_screen)

        setupNavigation()
    }

    private fun setupNavigation(){
        val navController = findNavController(R.id.nav_host_fragment)
        setupActionBarWithNavController(navController)
    }
}