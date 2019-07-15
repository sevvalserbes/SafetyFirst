package com.example.safetyfirst.main

class MainPresenter(counter: CounterInfo): MainContract.Presenter {


    private lateinit var mView: MainContract.View
    private var mCounter = counter

    override fun setView(view: MainContract.View) {
        mView = view
    }

    override fun created() {
        mView.bindView()
        mView.initOnClickListeners()

    }

    override fun onIncrementClicked() {
        mView.setAccidentTimesNumber(mCounter.increaseAccidentNumber())

    }

    override fun onDecrementClicked() {
        mView.setAccidentTimesNumber(mCounter.decreaseAccidentNumber())

    }

    override fun onClearClicked() {
        mView.setAccidentTimesNumber(mCounter.clearAccidentNumber())

    }

}