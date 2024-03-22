package com.example.recyclerview

import android.app.Activity
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
private lateinit var rvAdapter: RvAdapter
private lateinit var datalist: ArrayList<RvModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recyclerView=findViewById(R.id.rv)
datalist=ArrayList<RvModel>()
setContentView(R.layout.activity_main)
    datalist.add(RvModel(R.drawable.fork,"The Taj","India"))
        datalist.add(RvModel(R.drawable.fork,"The Taj","India"))
        datalist.add(RvModel(R.drawable.fork,"The Taj","India"))
        datalist.add(RvModel(R.drawable.fork,"The Taj","India"))
        datalist.add(RvModel(R.drawable.fork,"The Taj","India"))
        datalist.add(RvModel(R.drawable.fork,"The Taj","India"))
        datalist.add(RvModel(R.drawable.fork,"The Taj","India"))

        rvAdapter= RvAdapter(datalist,this)
        
        recyclerView.layoutManager=LinearLayoutManager(this)
recyclerView.adapter=rvAdapter

    }
}

