package com.example.crud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import com.google.firebase.database.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnLgn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLgn = findViewById(R.id.btnLgn)
        btnLgn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val dashboardpage = Intent(this, DashMenu::class.java)

        startActivity(dashboardpage)
    }
}