package com.example.safetyfirst.util.counterDataManagement

class CounterPrimary: CounterOperations {

    private var defaultAccidentNumber = 0

    override fun getDecreasedAccidentNumber(): Int{
        if (defaultAccidentNumber > 0){
            defaultAccidentNumber -= 1
        }
        else{

        }
        return defaultAccidentNumber
    }

    override fun getIncreasedAccidentNumber(): Int{
        defaultAccidentNumber += 1
        return defaultAccidentNumber
    }

    override fun clearAccidentNumber(){
        defaultAccidentNumber = 0
    }

    override fun getCurrentAccidentNumber(): Int{
        return defaultAccidentNumber
    }

}