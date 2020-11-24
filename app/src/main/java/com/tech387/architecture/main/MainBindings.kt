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

        if (!profiles.isNullOrEmpty()) {
            val profileItems = mutableListOf<ListItem>()

            profiles.forEach { p ->
                profileItems.add(MainItem(p))
            }

            bindListItems(profileItems)
        } else {
            bindListItems(listOf())
        }
    }

}