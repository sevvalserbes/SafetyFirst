package com.example.safetyfirst.util.counterDataManagement

interface CounterOperations {

    fun getIncreasedAccidentNumber(): Int

    fun getDecreasedAccidentNumber(): Int

    fun clearAccidentNumber()

    fun getCurrentAccidentNumber(): Int
}