package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.ItemAdapter
import com.example.recyclerview.datasource.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// hear we test the first step of creation data source --> to see if we do the link right or not
// =====================================================================|
//        val textView: TextView = findViewById(R.id.test)              |
//        textView.text= Datasource().loadAffirmation().size.toString() |
// =====================================================================|

        // Initialize data.
        val myDataset = Datasource().loadAffirmation()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)

    }
}