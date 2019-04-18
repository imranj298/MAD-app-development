package com.example.cob155_app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_new_item.*

class NewItem : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_item)


        cancel.setOnClickListener{view ->
            val intent = Intent(applicationContext, MainActivity::class.java)
            // start your next activity

            startActivity(intent)
        }

        doneFAB.setOnClickListener { view ->
            Snackbar.make(view, "New item added", Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show()
        }


    }
}
