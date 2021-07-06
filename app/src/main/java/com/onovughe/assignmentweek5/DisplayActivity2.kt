package com.onovughe.assignmentweek5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_display2.*

class DisplayActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display2)

        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)


        var intent = intent
        val aTitle = intent.getStringExtra("iTitle")
        val aDes3 = intent.getStringExtra("iDes1")
        val aImageView = intent.getIntExtra("imageView", 0)

        actionBar.setTitle(aTitle)
        a_title.text = aTitle
        a_title2.text = aDes3
        imageView.setImageResource(aImageView)

    }
}