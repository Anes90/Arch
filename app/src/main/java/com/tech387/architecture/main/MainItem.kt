package com.tech387.architecture.main

import com.tech387.architecture.R
import com.tech387.architecture.data.Profile
import com.tech387.architecture.util.list_item.ListItem

class MainItem(val profile: Profile) : ListItem(R.layout.main_item) {
    override fun areItemsTheSame(listItem: ListItem): Boolean {
        return listItem is MainItem && listItem.profile.id == profile.id
    }

    override fun areContentsTheSame(listItem: ListItem): Boolean {
        return listItem is MainItem && listItem.profile == profile
    }
}