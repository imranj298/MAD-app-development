package com.example.cob155_app

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ListView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            /*
            Snackbar.make(view, "Replace with new item", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            */

            val intent = Intent(applicationContext, NewItem::class.java)
            // start your next activity

            startActivity(intent)
        }
        //create OnClickListener for fab button

        val strings = arrayOf("one", "two")
        val content = arrayOf("Item 1", "Item 2")
        val list: ListView = this.findViewById<ListView>(R.id.Listy)


        val adapter = CustomAdapter(this, strings, content[0])

        list.adapter=adapter
    }

    /*Extra functions:*/

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }


    fun makeToast(string:String) {
        Toast.makeText(applicationContext, string, Toast.LENGTH_LONG).show()
        //Function for making toasts easily
    }
}
