package com.example.safetyfirst.util.counter

interface CounterOperations {

    fun getIncreasedAccidentNumber(): Int

    fun getDecreasedAccidentNumber(): Int

    fun resetAccidentNumber()

    fun getCurrentAccidentNumber(): Int
}