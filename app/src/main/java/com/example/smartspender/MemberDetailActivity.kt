package com.example.smartspender

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MemberDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_member_detail)

        val memberName = intent.getStringExtra("member_name") ?: "Member"
        val detailTextView = findViewById<TextView>(R.id.memberDetail)
        val memberImageView = findViewById<ImageView>(R.id.memberImage)

        // Display member-specific details and image
        when (memberName) {
            "Raji" -> {
                detailTextView.text = "Raji is a key contributor to our project."
                memberImageView.setImageResource(R.drawable.raji)
            }
            "Nivasshini" -> {
                detailTextView.text = "Nivasshini handles the creative aspects of the team."
                memberImageView.setImageResource(R.drawable.nivasshini)
            }
            "Harini" -> {
                detailTextView.text = "Harini manages the technical development of our project."
                memberImageView.setImageResource(R.drawable.harini)
            }
        }
    }
}
