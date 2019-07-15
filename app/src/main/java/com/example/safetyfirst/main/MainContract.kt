package com.example.safetyfirst.main

interface MainContract {

    interface View{

        fun bindView()

        fun initOnClickListeners()

        fun setAccidentTimesNumber(times: Int)

    }

    interface Presenter{

        fun setView(view: View)

        fun created()

        fun onIncrementClicked()

        fun onDecrementClicked()

        fun onClearClicked()

    }
}