package com.humart.minseok.mvpexample.main

/**
 * Created by minseok on 2018. 2. 6..
 * MVPExample.
 */
class MainPresenter(private var mView: MainContract.View) : MainContract.Presenter {
    override fun onStart() {
        mView.toast("onStart")
    }

    override fun onStop() {
        mView.toast("onStop")
    }

    override fun onClickAButton() {
        mView.showAData()
        mView.moveToNothing()
    }

    override fun onClickBButton() {
        mView.showBData()
        mView.moveToCounter()
    }

    init {
        this.mView.setPresenter(this)
    }
}