package com.example.parepro_xml

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.parepro_xml.databinding.ActivityMainBinding
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder

class MainActivity : AppCompatActivity() {
    private val initialItems = listOf(
        Pair("りんご", "とても美味しい"),
        Pair("ゴリラ", "とても強い"),
        Pair("ラッパ", "とてもうるさい"),
        Pair("パンツ", "とても臭い"),
        Pair("積み木", "とても楽しい"),
        Pair("キツネ", "とても動物"),
        Pair("ネコ", "とてもネコ"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val groupAdapter = GroupAdapter<GroupieViewHolder>()
        val listView = binding.listView
        listView.adapter = groupAdapter

        binding.showButton.setOnClickListener {
            if (listView.visibility == View.VISIBLE) {
                return@setOnClickListener
            }
            initialItems.forEach {
                groupAdapter.add(ListItem(it.first, it.second))
            }
            listView.visibility = View.VISIBLE
        }

        binding.addButton.setOnClickListener {
            initialItems.forEach {
                groupAdapter.add(ListItem(it.first, it.second))
            }
        }
    }
}