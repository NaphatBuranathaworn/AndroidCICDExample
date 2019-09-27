package com.playground.testci

class MainActivityPresenter {

    fun calculateClick(input1: Int, input2: Int, opr: Int): Int {
        when(opr) {
            0 -> return input1 + input2
            else -> return 0
        }
    }

}