package com.example.safetyfirst.mainActivity

import com.example.safetyfirst.util.counterDataManagement.CounterOperations

class MainPresenter(counterOperations: CounterOperations): MainContract.Presenter {


    private lateinit var mView: MainContract.View
    private var mCounterOperations = counterOperations

    override fun setView(view: MainContract.View) {
        mView = view
    }

    override fun created() {
        mView.bindView()
        mView.initOnClickListeners()
        mView.hideSupportActionBar()

    }

    override fun onIncrementClick() {
        mView.setAccidentTimesNumber(mCounterOperations.getIncreasedAccidentNumber())

    }

    override fun onDecrementClick() {
        mView.setAccidentTimesNumber(mCounterOperations.getDecreasedAccidentNumber())

    }

    override fun onClearClick() {
        mCounterOperations.clearAccidentNumber()
        mView.setAccidentTimesNumber(mCounterOperations.getCurrentAccidentNumber())

    }

}