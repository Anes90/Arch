package com.tech387.architecture.main

import android.util.Log
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.tech387.architecture.data.Profile
import com.tech387.architecture.util.list_item.ListItem
import com.tech387.architecture.util.list_item.ListItemBindings.bindListItems

object MainBindings {

    @JvmStatic
    @BindingAdapter("app:main_profiles")
    fun RecyclerView.bindMainProfiles(profiles: List<Profile>?) {
        Log.e("Prf", "${profiles?.size}")

        if (!profiles.isNullOrEmpty()) { //Ako lista profiles nije prazna
            val profileItems = mutableListOf<ListItem>() //kreira izmjenjivu listu ListItem-a

            profiles.forEach { p ->
                profileItems.add(MainItem(p)) //Za svaki profil dodaje MainItem u listu profileItems. MainItem je objekat koji nasljedjuje ListItem i
                                              //provjerava da li su proslijedjeni i postojeci ListItem-i isti i da li su im sadrzaji isti
            }

            bindListItems(profileItems) //dodjeljuje listu profileItems adapteru
        } else {
            bindListItems(listOf()) //ako je lista profiles prazna, dodjeljuje praznu listu adapteru
        }
    }

}