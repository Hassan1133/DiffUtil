package com.example.diffutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler : RecyclerView = findViewById(R.id.recycler)
        val adp = PersonAdapter()

        val item1 = Person(1, "H", "Hassan")
        val item2 = Person(2, "A", "Ahmad")
        val item3 = Person(3, "F", "Fahad")

        adp.submitList(listOf(item1,item2,item3))
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.setHasFixedSize(true)
        recycler.adapter = adp

        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            val item3 = Person(3, "F", "Fahad")
            val item4 = Person(4, "K", "Kamal")
            val item5 = Person(5, "M", "Mubeen")
            adp.submitList(listOf(item3,item4,item5))
        }, 4000)

    }
}