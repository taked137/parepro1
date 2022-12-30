package com.example.parepro_xml

import android.view.View
import com.example.parepro_xml.databinding.ListItemBinding
import com.xwray.groupie.viewbinding.BindableItem

class ListItem(
    private val title: String,
    private val channel: String,
) : BindableItem<ListItemBinding>() {
    override fun getLayout() = R.layout.list_item
    override fun initializeViewBinding(view: View) = ListItemBinding.bind(view)

    override fun bind(viewBinding: ListItemBinding, position: Int) {
        viewBinding.title.text = title
        viewBinding.channel.text = channel
    }
}