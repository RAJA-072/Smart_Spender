package com.example.smartspender

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Team member 1 - Raji
        val rajiImage = findViewById<ImageView>(R.id.rajiImage)
        val rajiName = findViewById<TextView>(R.id.rajiName)
        rajiImage.setOnClickListener { navigateTo(RajiActivity::class.java) }
        rajiName.setOnClickListener { navigateTo(RajiActivity::class.java) }

        // Team member 2 - Nivasshini
        val nivasshiniImage = findViewById<ImageView>(R.id.nivasshiniImage)
        val nivasshiniName = findViewById<TextView>(R.id.nivasshiniName)
        nivasshiniImage.setOnClickListener { navigateTo(NivasshiniActivity::class.java) }
        nivasshiniName.setOnClickListener { navigateTo(NivasshiniActivity::class.java) }

        // Team member 3 - Harini
        val hariniImage = findViewById<ImageView>(R.id.hariniImage)
        val hariniName = findViewById<TextView>(R.id.hariniName)
        hariniImage.setOnClickListener { navigateTo(HariniActivity::class.java) }
        hariniName.setOnClickListener { navigateTo(HariniActivity::class.java) }

        // Set up Popup Menu for additional actions
        val popupButton = findViewById<View>(R.id.popupButton)
        popupButton.setOnClickListener {
            val popupMenu = PopupMenu(this, it)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.about_us -> startActivity(Intent(this, AboutUsActivity::class.java))
                    R.id.project_description -> startActivity(Intent(this, ProjectDescriptionActivity::class.java))
                    else -> false
                }
                true
            }
            popupMenu.show()
        }
    }

    // Method for navigation to other activities
    private fun navigateTo(activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }

    // Create the Option Menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    // Handle Option Menu Item selection
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about_us -> startActivity(Intent(this, AboutUsActivity::class.java))
            R.id.team_details -> startActivity(Intent(this, TeamDetailsActivity::class.java))
            R.id.team_members -> startActivity(Intent(this, TeamMembersActivity::class.java))
            R.id.project_description -> startActivity(Intent(this, ProjectDescriptionActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }

    // Create the Context Menu
    override fun onCreateContextMenu(menu: android.view.ContextMenu?, v: View?, menuInfo: android.view.ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context_menu, menu)
    }

    // Handle Context Menu Item selection
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about_us -> startActivity(Intent(this, AboutUsActivity::class.java))
            R.id.team_details -> startActivity(Intent(this, TeamDetailsActivity::class.java))
            R.id.team_members -> startActivity(Intent(this, TeamMembersActivity::class.java))
        }
        return super.onContextItemSelected(item)
    }
}
