package com.example.safetyfirst.main

interface MainContract {

    interface View{

        fun initViews()

        fun initOnClickListeners()

        fun setAccidentCounter(times: Int)

        fun hideSupportActionBar()

    }

    interface Presenter{

        fun setView(view: View)

        fun created()

        fun onIncrementClick()

        fun onDecrementClick()

        fun onClearClick()

    }
}