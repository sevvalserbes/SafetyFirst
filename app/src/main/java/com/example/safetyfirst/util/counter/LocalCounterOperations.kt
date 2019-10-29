package com.example.safetyfirst.util.counter

class LocalCounterOperations: ICounterOperations {

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

    override fun resetAccidentNumber(){
        defaultAccidentNumber = 0
    }

    override fun getCurrentAccidentNumber(): Int{
        return defaultAccidentNumber
    }

}