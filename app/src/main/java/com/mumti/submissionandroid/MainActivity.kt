package com.mumti.submissionandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var rvSkincares: RecyclerView
    private var list: ArrayList<Skincare> = arrayListOf()
    private var title: String = "Home"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvSkincares = findViewById(R.id.rv_skincares)
        rvSkincares.setHasFixedSize(true)

        list.addAll(SkincareData.listData)
        showRecyclerList()
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showRecyclerList() {
        rvSkincares.layoutManager = LinearLayoutManager(this)
        val listSkincareAdapter = ListSkincareAdapter(list)
        rvSkincares.adapter = listSkincareAdapter

        listSkincareAdapter.setOnItemClickCallback(object: ListSkincareAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Skincare) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("SkincareName", data.name)
                intent.putExtra("SkincarePrice", data.price)
                intent.putExtra("SkincareDescription", data.desc)
                intent.putExtra("SkincarePhoto", data.photo)
                startActivity(intent)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun showProfile() {
        val moveIntent = Intent(this@MainActivity, Profile::class.java)
        startActivity(moveIntent)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.profile -> {
                setActionBarTitle("Profil")
                showProfile()
            }
        }
        setActionBarTitle(title)
    }
}