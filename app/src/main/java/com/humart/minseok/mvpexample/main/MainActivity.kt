package com.humart.minseok.mvpexample.main

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.humart.minseok.mvpexample.R
import com.humart.minseok.mvpexample.counter.CounterActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {
    private lateinit var mPresenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MainPresenter(this)

        /* View -> Presenter */
        btn_a.setOnClickListener { mPresenter.onClickAButton() }
        btn_b.setOnClickListener { mPresenter.onClickBButton() }
    }

    override fun onStart() {
        super.onStart()
        mPresenter.onStart()
    }

    override fun onStop() {
        mPresenter.onStop()
        super.onStop()
    }

    override fun setPresenter(presenter: MainContract.Presenter) {
        this.mPresenter = presenter as MainPresenter
    }

    override fun showAData() {
        toast("Click A Button!")
    }

    override fun showBData() {
        toast("Click B Button!")
    }

    override fun moveToNothing() {
        toast("There is No Destination!")
    }

    override fun moveToCounter() {
        Intent(this, CounterActivity::class.java).also { startActivity(it) }
    }

    override fun toast(string: String) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show()
    }
}
