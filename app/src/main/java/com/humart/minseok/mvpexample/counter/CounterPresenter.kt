package com.humart.minseok.mvpexample.counter

/**
 * Created by minseok on 2018. 2. 8..
 * MVPExample.
 */
class CounterPresenter(var mView: CounterConstract.View) : CounterConstract.Presenter {
    private var count: Int = 0

    override fun onStart() {
        mView.toast("onStart: Count")
    }

    override fun onStop() {
        mView.toast("onStop: Count")
    }

    override fun onClickIncreBtn() {
        mView.setCount(++count)
    }

    override fun onClickDecreBtn() {
        if (count != 0) mView.setCount(--count)
    }

    override fun onClickInitiation() {
        count = 0
        mView.setCount(count)
    }

    init {
        mView.setPresenter(this)
        mView.setCount(count)
    }
}