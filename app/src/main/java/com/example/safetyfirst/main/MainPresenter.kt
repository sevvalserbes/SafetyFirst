package com.example.safetyfirst.main

import com.example.safetyfirst.util.counter.CounterOperations

class MainPresenter(private var counterOperations: CounterOperations) : MainContract.Presenter {

    private lateinit var view: MainContract.View

    override fun setView(view: MainContract.View) {
        this.view = view
    }

    override fun created() {
        view.initViews()
        view.hideSupportActionBar()
        view.initOnClickListeners()
    }

    override fun onIncrementClick() {
        view.setAccidentCounter(counterOperations.getIncreasedAccidentNumber())
    }

    override fun onDecrementClick() {
        view.setAccidentCounter(counterOperations.getDecreasedAccidentNumber())
    }

    override fun onResetClick() {
        counterOperations.resetAccidentNumber()
        view.setAccidentCounter(counterOperations.getCurrentAccidentNumber())
    }
}