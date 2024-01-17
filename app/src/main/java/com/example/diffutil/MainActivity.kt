package com.example.diffutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler : RecyclerView = findViewById(R.id.recycler)
        val adp = ProgrammingAdapter()

        val item1 = ProgrammingItem(1, "A", "Android")
        val item2 = ProgrammingItem(2, "K", "Kotlin")
        val item3 = ProgrammingItem(3, "P", "Python")

        adp.submitList(listOf(item1,item2,item3))
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.setHasFixedSize(true)
        recycler.adapter = adp

    }
}