package com.example.googleplay

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AppAdapter(
    private var context: Context,
    private var apps: List<AppInStore>
) : RecyclerView.Adapter<AppHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppHolder {
        return AppHolder(LayoutInflater
            .from(context)
            .inflate(R.layout.app_inner, parent, false))
    }

    override fun getItemCount(): Int {
        return apps.size
    }

    override fun onBindViewHolder(holder: AppHolder, position: Int) {
        holder.nameView.text = apps[position].name
        holder.rateView.text = apps[position].rating
        holder.imageView.setImageResource(apps[position].image)
    }
}