package com.tech387.architecture.util.list_item

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.tech387.architecture.util.list_item.ListItem

object ListItemBindings {

    @JvmStatic
    @BindingAdapter("app:listItems")
    fun RecyclerView.bindListItems(items: List<ListItem>?) {
        (adapter as ListItemAdapter).setItems(items ?: listOf())
    }

    @JvmStatic
    @BindingAdapter("app:listItems")
    fun ViewPager2.bindListItems(items: List<ListItem>?) {
        (adapter as ListItemAdapter).setItems(items ?: listOf())
    }


}