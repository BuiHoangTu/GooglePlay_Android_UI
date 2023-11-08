package com.example.googleplay

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class SectionViewHolder(itemView: RecyclerView) : RecyclerView.ViewHolder(itemView) {
    var sectionView: View

    init {
        this.sectionView = itemView
    }
}