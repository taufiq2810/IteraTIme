package com.itera.iteratime

import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import com.itera.iteratime.ui.main.SectionsPagerAdapter

class JadwalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jadwal)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
        tabs.tabMode = TabLayout.MODE_SCROLLABLE
        val fab: FloatingActionButton = findViewById(R.id.fab)

        fab.setOnClickListener {
            //            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
            val addActivity = Intent(this,AddJadwalActivity::class.java)
            startActivity(addActivity)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_map, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.gelap -> {
                showGelap()
            }
            R.id.terang -> {
                showTerang()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    private fun showGelap() {
        setTheme(R.style.AppTheme)
    }

    private fun showTerang() {
        setTheme(R.style.AppTheme2)
    }
}