package com.example.safetyfirst.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatImageButton
import androidx.appcompat.widget.AppCompatTextView
import com.example.safetyfirst.R

class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var mPresenter: MainPresenter

    private lateinit var mTextViewTimes: AppCompatTextView
    private lateinit var mButtonIncrement: AppCompatImageButton
    private lateinit var mButtonDecrement: AppCompatImageButton
    private lateinit var mButtonClear: AppCompatImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val counterInfo = CounterInfo()

        this.mPresenter = MainPresenter(counterInfo)
        mPresenter.setView(this)
        mPresenter.created()
    }

    override fun bindView() {
        mTextViewTimes = findViewById(R.id.main_tv_times_of_accident)
        mButtonIncrement = findViewById(R.id.main_ib_increment)
        mButtonDecrement = findViewById(R.id.main_ib_decrement)
        mButtonClear = findViewById(R.id.main_ib_clear)
    }

    override fun initOnClickListeners() {

        mButtonIncrement.setOnClickListener{
            mPresenter.onIncrementClicked()
        }

        mButtonDecrement.setOnClickListener {
            mPresenter.onDecrementClicked()
        }

        mButtonClear.setOnClickListener {
            mPresenter.onClearClicked()
        }
    }

    override fun setAccidentTimesNumber(times: Int) {
        mTextViewTimes.text = times.toString()
    }
}
