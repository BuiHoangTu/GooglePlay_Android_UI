package com.example.googleplay

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SectionAdapter(
    private val context: Context,
    private val sections: List<RecyclerView>
): RecyclerView.Adapter<SectionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectionViewHolder {
        return SectionViewHolder(LayoutInflater
            .from(context)
            .inflate(R.layout.section, parent, false))
    }

    override fun getItemCount(): Int {
        return sections.count()
    }

    override fun onBindViewHolder(holder: SectionViewHolder, position: Int) {
        holder.sectionView = sections[position].findViewById(R.id.sector_view)
    }
}