package com.example.smartspender

import android.content.Intent
import android.os.Bundle
import android.view.ContextMenu
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity

class TeamMembersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_members)

        // Register context menu for all team member ImageViews
        val rajiImage = findViewById<ImageView>(R.id.rajiImage)
        val nivasshiniImage = findViewById<ImageView>(R.id.nivasshiniImage)
        val hariniImage = findViewById<ImageView>(R.id.hariniImage)

        registerForContextMenu(rajiImage)
        registerForContextMenu(nivasshiniImage)
        registerForContextMenu(hariniImage)

        // Popup Menu setup
        val popupButton = findViewById<Button>(R.id.popupButton)
        popupButton.setOnClickListener {
            val popupMenu = PopupMenu(this, it)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.about_us -> startActivity(Intent(this, AboutUsActivity::class.java))
                    R.id.project_description -> startActivity(Intent(this, ProjectDescriptionActivity::class.java))
                }
                true
            }
            popupMenu.show()
        }
    }

    // Create context menu
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context_menu, menu)

        menu?.setHeaderTitle(
            when (v?.id) {
                R.id.rajiImage -> "Raji Options"
                R.id.nivasshiniImage -> "Nivasshini Options"
                R.id.hariniImage -> "Harini Options"
                else -> "Options"
            }
        )

        v?.tag = when (v?.id) {
            R.id.rajiImage -> "Raji"
            R.id.nivasshiniImage -> "Nivasshini"
            R.id.hariniImage -> "Harini"
            else -> ""
        }
    }




}
