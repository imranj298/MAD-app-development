package com.example.cob155_app.DBHelper


import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context) :SQLiteOpenHelper(context, DATABASE_NAME,null, DATABASE_VER) {
    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_TABLE_QUERY = ("CREATE TABLE " + TABLE_NAME+"("
                //TODO: add this stuff in HERE
        )
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {
        private val DATABASE_VER = 1
        private val DATABASE_NAME = "Wishlist.db"

        //Table
        private val TABLE_NAME="Item"
        private val COL_ID = "ID"
        private val COL_ITEMNAME = "Item Name"
        private val COL_URL = "Web URL"
        private val COL_PRICE = "Item Price"
    }
}