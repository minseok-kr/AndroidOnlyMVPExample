package com.humart.minseok.mvpexample.main

import com.humart.minseok.mvpexample.BasePresenter
import com.humart.minseok.mvpexample.BaseView

/**
 * Created by minseok on 2018. 2. 6..
 * MVPExample.
 */
interface MainContract {

    interface View : BaseView<Presenter> {
        fun showAData()
        fun showBData()

        fun moveToNothing()
        fun moveToCounter()
    }

    interface Presenter : BasePresenter {
        fun onClickAButton()
        fun onClickBButton()
    }
}