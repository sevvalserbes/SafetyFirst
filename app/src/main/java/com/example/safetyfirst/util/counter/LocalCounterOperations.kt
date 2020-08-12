package com.example.safetyfirst.util.counter

class LocalCounterOperations : CounterOperations {

    private var accidentNumber = 0

    override fun getDecreasedAccidentNumber(): Int {
        return if (accidentNumber > 0) {
            accidentNumber = accidentNumber.minus(1)
            accidentNumber
        } else {
            accidentNumber
        }
    }

    override fun getIncreasedAccidentNumber(): Int {
        return if (accidentNumber < 100) {
            accidentNumber = accidentNumber.plus(1)
            accidentNumber
        } else {
            100
        }
    }

    override fun resetAccidentNumber() {
        accidentNumber = 0
    }

    override fun getCurrentAccidentNumber(): Int = accidentNumber
}