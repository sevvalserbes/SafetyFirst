package com.example.safetyfirst.mainActivity

interface MainContract {

    interface View{

        fun bindView()

        fun initOnClickListeners()

        fun setAccidentTimesNumber(times: Int)

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