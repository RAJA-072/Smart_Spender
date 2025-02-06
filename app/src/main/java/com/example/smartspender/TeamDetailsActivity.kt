package com.example.smartspender

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class TeamDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_details)

        val teamDetailsTextView = findViewById<TextView>(R.id.teamDetailsText)
        teamDetailsTextView.text = getString(R.string.team_details)
    }
}
