package com.example.cob155_app.Model

class Item {
    var id:Int = 0
    var itemName:String?=null
    var url:String?=null
    var price:Double = 0.0

    constructor(){}

    constructor(id:Int, itemName:String, url:String, price:Double){
        this.id = id
        this.itemName = itemName
        this.url = url
        this.price = price
    }
}