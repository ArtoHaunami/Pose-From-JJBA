package com.example.posefromjjba

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

package com.example.posefromjjba
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager import androidx.recyclerview.widget.RecyclerView
class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView) recyclerView.layoutManager = LinearLayoutManager(this)
        val datalist = listOf(
            DataModel("Item 1"),
            DataModel("Item 2"),
            DataModel("Item 3"),
            DataModel("Item 4")
    }
}
val adapter = MyAdapter(datalist) recyclerView.adapter = adapter


    class MainActivity: AppCompatActivity() {

        private lateinit var binding: ActivityMainBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
            Picasso
                .get()
                .load()
                .into(binding.image);
        }

    }

