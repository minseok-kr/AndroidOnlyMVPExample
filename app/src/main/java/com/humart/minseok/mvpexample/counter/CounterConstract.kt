package com.humart.minseok.mvpexample.counter

import com.humart.minseok.mvpexample.BasePresenter
import com.humart.minseok.mvpexample.BaseView

/**
 * Created by minseok on 2018. 2. 8..
 * MVPExample.
 */
interface CounterConstract {

    interface View: BaseView<Presenter> {
        fun setCount(count: Int)
    }

    interface Presenter: BasePresenter {
        fun onClickIncreBtn()
        fun onClickDecreBtn()
        fun onClickInitiation()
//        fun getCount(): Int 만들면 안되지 않을까? View는 그냥 띄어주기용이잖아
    }
}