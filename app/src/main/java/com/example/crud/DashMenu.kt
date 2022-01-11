package com.example.crud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class DashMenu : AppCompatActivity(), View.OnClickListener {
    private lateinit var card : CardView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_menu)

        card=findViewById(R.id.cardHutang)
        card.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val dashhome= Intent(this, Login::class.java)

        startActivity(dashhome)
    }
}