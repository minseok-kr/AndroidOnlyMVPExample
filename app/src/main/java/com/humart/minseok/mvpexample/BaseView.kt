package com.humart.minseok.mvpexample

/**
 * Created by minseok on 2018. 2. 6..
 * MVPExample.
 */
interface BaseView<in T : BasePresenter> {
    fun setPresenter(presenter: T)
    fun toast(string: String)
}