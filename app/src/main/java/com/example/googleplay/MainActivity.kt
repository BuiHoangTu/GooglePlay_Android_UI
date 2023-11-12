package com.example.googleplay

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private val senders = setOf(
        "John Wick",
        "Robert J",
        "James Gunn",
        "Ricky Tales",
        "Micky Mouse",
        "Pick War").toList()

    @SuppressLint("DiscouragedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        // generate random
        val apps = ArrayList<AppInStore>()
        repeat(20) {
            val random = Random(it)
            val sender = senders[random.nextInt(0, senders.size)]
            val delimiter = sender.indexOf(' ')
            val firstName = sender.lowercase().subSequence(0, delimiter)
            val restName = sender.lowercase().subSequence(delimiter + 1, sender.length)

            val avatar = this.resources.getIdentifier(
                "user_${firstName}_${restName}_playstore",
                "drawable",
                this.packageName
            )
            Log.v("TAG", "avatar_id of user_${firstName}_${restName} = $avatar")

            apps.add(
                AppInStore(
                    sender,
                    random.nextInt(0, 10).div(10f).toString(),
                    avatar
                )
            )
        }



        val sections = ArrayList<Section>();

        // some views
        repeat(20) {
//            val recyclerView1 : RecyclerView = findViewById(R.id.sector_view)
//            recyclerView1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
//            recyclerView1.adapter = AppAdapter(applicationContext, apps);

            sections.add(Section(apps));
        }

        // outer view
        val masterView: RecyclerView = findViewById(R.id.main_view)
        masterView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        masterView.adapter = SectionAdapter(applicationContext, sections)

    }

}

