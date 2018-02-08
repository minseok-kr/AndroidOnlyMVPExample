package com.humart.minseok.mvpexample.counter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.humart.minseok.mvpexample.R
import kotlinx.android.synthetic.main.activity_counter.*

class CounterActivity : AppCompatActivity(), CounterConstract.View {
    private lateinit var mPresenter: CounterConstract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)
        CounterPresenter(this)

        btn_incre.setOnClickListener { mPresenter.onClickIncreBtn() }
        btn_decre.setOnClickListener { mPresenter.onClickDecreBtn() }
        btn_initiation.setOnClickListener { mPresenter.onClickInitiation() }
    }

    override fun setPresenter(presenter: CounterConstract.Presenter) {
        mPresenter = presenter
    }

    override fun toast(string: String) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show()
    }

    override fun setCount(count: Int) {
        txt_count.text = count.toString()
    }
}
