package com.example.logindemo.request

class LoginRequest {

    var username:String? = null

    var password:String? = null

    public fun setUsername(username:String):LoginRequest{
        this.username = username
        return this
    }

    public fun setPassword(password:String):LoginRequest{
        this.password = password
        return this
    }

}