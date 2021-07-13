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

        arrayList.add(Model("Jackie", "Chan", R.drawable.img1))
        arrayList.add(Model("Jet", "Li", R.drawable.img2))
        arrayList.add(Model("Keanu", "Reeves", R.drawable.img3))
        arrayList.add(Model("Jason", "Statham", R.drawable.img4))
        arrayList.add(Model("Vin", "Diesel", R.drawable.img5))
        arrayList.add(Model("Sylvester", "Stallon", R.drawable.img6))
        arrayList.add(Model("Angelina", "jolie", R.drawable.img7))
        arrayList.add(Model("Van", "Damme", R.drawable.img8))
        arrayList.add(Model("Cristiano", "Ronaldo", R.drawable.img9))
        arrayList.add(Model("lionel", "Messi", R.drawable.img10))
        arrayList.add(Model("Wayne", "Rooney", R.drawable.img11))
        arrayList.add(Model("Jackie", "Chan", R.drawable.img12))
        arrayList.add(Model("Jackie", "Chan", R.drawable.img13))
        arrayList.add(Model("Jackie", "Chan", R.drawable.img14))
        arrayList.add(Model("Jackie", "Chan", R.drawable.img15))
        arrayList.add(Model("Jackie", "Chan", R.drawable.img16))
        arrayList.add(Model("Jackie", "Chan", R.drawable.img17))
        arrayList.add(Model("Jackie", "Chan", R.drawable.img18))
        arrayList.add(Model("Jackie", "Chan", R.drawable.img19))
        arrayList.add(Model("Jackie", "Chan", R.drawable.img20))

        val myAdapter = MyAdapter(arrayList, this)
        recycler1.layoutManager = LinearLayoutManager(this)
        recycler1.adapter = myAdapter
    }
}