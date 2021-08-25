package com.example.myrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecycleview.data.Product
import com.example.myrecycleview.data.ProductAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productList = listOf<Product>(
            Product("Apple", 2.50, R.drawable.ic_baseline_adb_24),
            Product("Durian", 12.50, R.drawable.ic_baseline_adb_24),
            Product("Orange", 1.30, R.drawable.ic_baseline_adb_24),
            Product("Pen", 5.30, R.drawable.ic_baseline_adb_24),
        )

        val myRecyclerView : RecyclerView = findViewById(R.id.RecycleView)
        myRecyclerView.adapter = ProductAdapter(productList)
        myRecyclerView.setHasFixedSize(true)
    }
}