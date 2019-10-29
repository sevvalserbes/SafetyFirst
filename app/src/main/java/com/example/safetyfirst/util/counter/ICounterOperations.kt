package com.example.safetyfirst.util.counter

interface ICounterOperations {

    fun getIncreasedAccidentNumber(): Int

    fun getDecreasedAccidentNumber(): Int

    fun resetAccidentNumber()

    fun getCurrentAccidentNumber(): Int
}