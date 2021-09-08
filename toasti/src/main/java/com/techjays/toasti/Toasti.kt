package com.techjays.toasti

import android.content.Context
import android.widget.Toast

open class Toasti {

    companion object{
        fun showToast(context:Context,msg:String){
            Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
        }
    }
}