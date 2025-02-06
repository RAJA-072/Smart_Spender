package com.example.smartspender

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class NivasshiniActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nivasshini)

        // Additional details about Raji can be set up here if needed.
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about_us -> {
                val intent = Intent(this, AboutUsActivity::class.java)
                startActivity(intent)
            }
            R.id.team_details -> {
                val intent = Intent(this, TeamDetailsActivity::class.java)
                startActivity(intent)
            }
            R.id.team_members -> {
                val intent = Intent(this, TeamMembersActivity::class.java)
                startActivity(intent)
            }
            R.id.project_description -> {
                val intent = Intent(this, ProjectDescriptionActivity::class.java)
                startActivity(intent)
            }
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }
}
