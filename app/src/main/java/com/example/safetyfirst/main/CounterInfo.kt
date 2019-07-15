package com.example.safetyfirst.main

import android.widget.Toast

class CounterInfo {

    private var defaultAccidentNumber = 0

    fun decreaseAccidentNumber(): Int{
        if (defaultAccidentNumber > 0){
            defaultAccidentNumber -= 1
        }
        else{

        }
        return defaultAccidentNumber
    }

    fun increaseAccidentNumber(): Int{
        defaultAccidentNumber += 1
        return defaultAccidentNumber
    }

    fun clearAccidentNumber(): Int{
        defaultAccidentNumber = 0
        return defaultAccidentNumber
    }

    fun getCurrentAccidentNumber(): Int{
        return defaultAccidentNumber
    }

}