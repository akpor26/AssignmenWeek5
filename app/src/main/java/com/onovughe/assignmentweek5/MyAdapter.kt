package com.onovughe.assignmentweek5

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*

class MyAdapter(val arrayList: ArrayList<Model>, val context: Context):
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindItems(model: Model) {
            itemView.titleTv.text = model.title
            itemView.title2Tv.text = model.des
            itemView.imageIv.setImageResource(model.image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener{
            val model = arrayList.get(position)
            var gTitle: String = model.title
            var gDes1: String = model.des
            var gImage: Int = model.image

            val intent = Intent(context, DisplayActivity2::class.java)
            intent.putExtra("iTitle", gTitle)
            intent.putExtra("iDes1", gDes1)
            intent.putExtra("imageView", gImage)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
       return arrayList.size
    }
}
