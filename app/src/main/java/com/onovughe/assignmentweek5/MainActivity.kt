package com.onovughe.assignmentweek5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Jackie", "Chan", R.drawable.Img1))
        arrayList.add(Model("Jackie", "Chan", R.drawable.img2))
        arrayList.add(Model("Jackie", "Chan", R.drawable.img3))
        arrayList.add(Model("Jackie", "Chan", R.drawable.Img4))
        arrayList.add(Model("Jackie", "Chan", R.drawable.Img5))
        arrayList.add(Model("Jackie", "Chan", R.drawable.Img6))
        arrayList.add(Model("Jackie", "Chan", R.drawable.Img7))
        arrayList.add(Model("Jackie", "Chan", R.drawable.Img8))
        arrayList.add(Model("Jackie", "Chan", R.drawable.img9))
        arrayList.add(Model("Jackie", "Chan", R.drawable.Img10))
        arrayList.add(Model("Jackie", "Chan", R.drawable.Img11))
        arrayList.add(Model("Jackie", "Chan", R.drawable.Img12))
        arrayList.add(Model("Jackie", "Chan", R.drawable.img13))
        arrayList.add(Model("Jackie", "Chan", R.drawable.Img14))
        arrayList.add(Model("Jackie", "Chan", R.drawable.Img15))
        arrayList.add(Model("Jackie", "Chan", R.drawable.img16))
        arrayList.add(Model("Jackie", "Chan", R.drawable.Img17))
        arrayList.add(Model("Jackie", "Chan", R.drawable.Img18))
        arrayList.add(Model("Jackie", "Chan", R.drawable.Img19))
        arrayList.add(Model("Jackie", "Chan", R.drawable.Img20))

        val myAdapter = MyAdapter(arrayList, this)
        recycler1.layoutManager = LinearLayoutManager(this)
        recycler1.adapter = myAdapter
    }
}