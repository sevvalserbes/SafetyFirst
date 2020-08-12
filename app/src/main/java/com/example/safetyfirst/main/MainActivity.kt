package com.example.safetyfirst.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatImageButton
import androidx.appcompat.widget.AppCompatTextView
import com.example.safetyfirst.R
import com.example.safetyfirst.util.counter.LocalCounterOperations

class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var presenter: MainPresenter

    private lateinit var textViewAccidentTimes: AppCompatTextView
    private lateinit var buttonIncrement: AppCompatImageButton
    private lateinit var buttonDecrement: AppCompatImageButton
    private lateinit var buttonReset: AppCompatImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val localCounterOperations = LocalCounterOperations()

        this.presenter = MainPresenter(localCounterOperations)
        presenter.setView(this)
        presenter.created()
    }

    override fun initViews() {
        textViewAccidentTimes = findViewById(R.id.text_view_accident_number)
        buttonIncrement = findViewById(R.id.image_button_increment)
        buttonDecrement = findViewById(R.id.image_button_decrement)
        buttonReset = findViewById(R.id.image_button_reset)
    }

    override fun initOnClickListeners() {

        buttonIncrement.setOnClickListener{
            presenter.onIncrementClick()
        }

        buttonDecrement.setOnClickListener {
            presenter.onDecrementClick()
        }

        buttonReset.setOnClickListener {
            presenter.onResetClick()
        }
    }

    override fun setAccidentCounter(times: Int) {
        textViewAccidentTimes.text = times.toString()
    }

    override fun hideSupportActionBar() {
        supportActionBar?.hide()
    }
}
