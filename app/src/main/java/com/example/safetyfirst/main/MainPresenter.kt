package com.example.safetyfirst.main

import com.example.safetyfirst.util.counter.ICounterOperations

class MainPresenter(counterOperations: ICounterOperations): MainContract.Presenter {


    private lateinit var mView: MainContract.View
    private var mCounterOperations = counterOperations

    override fun setView(view: MainContract.View) {
        mView = view
    }

    override fun created() {
        mView.initViews()
        mView.hideSupportActionBar()
        mView.initOnClickListeners()

    }

    override fun onIncrementClick() {
        mView.setAccidentCounter(mCounterOperations.getIncreasedAccidentNumber())

    }

    override fun onDecrementClick() {
        mView.setAccidentCounter(mCounterOperations.getDecreasedAccidentNumber())

    }

    override fun onClearClick() {
        mCounterOperations.resetAccidentNumber()
        mView.setAccidentCounter(mCounterOperations.getCurrentAccidentNumber())

    }

}