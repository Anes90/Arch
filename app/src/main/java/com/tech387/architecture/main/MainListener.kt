package com.tech387.architecture.main

import com.tech387.architecture.data.Profile
import com.tech387.architecture.util.list_item.ListItemListener

interface MainListener : ListItemListener {

    fun onProfileClick(profile: Profile)

}