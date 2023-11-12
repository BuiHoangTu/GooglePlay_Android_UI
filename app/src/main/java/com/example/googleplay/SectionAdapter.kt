package com.example.googleplay

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SectionAdapter(
    private val context: Context,
    private val sections: List<Section>
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
        val sectionView = holder.sectionView.findViewById<RecyclerView>(R.id.sector_view)
        sectionView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        sectionView.adapter = AppAdapter(context, sections[position].appsInSection)
    }
}