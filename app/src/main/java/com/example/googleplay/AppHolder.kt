package com.example.googleplay

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AppHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var imageView: ImageView
    var nameView: TextView
    var rateView: TextView

    init {
        imageView = itemView.findViewById(R.id.imageview)
        nameView = itemView.findViewById(R.id.name)
        rateView = itemView.findViewById(R.id.rate)
    }
}