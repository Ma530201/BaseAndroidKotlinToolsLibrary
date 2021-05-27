package com.ronsu.androidkotlinlibrary.transitions

import com.ronsu.androidkotlinlibrary.R

/**
 * 專案名稱:BaseAndroidKotlinToolsLibrary
 * 類描述: * 建立人:Playsuer-Ron
 * 建立時間:2021/5/27 上午 09:50
 * 修改人:Playsuer-Ron
 * 修改時間:2021/5/27 上午 09:50
 * 修改備註: * @version */

/**
 * val transitions = Transitions(this@LoadActivity)
 * transitions.setAnimation(Slide().InUp())
 **/
class Slide {
    fun InUp(): Array<Int> {
        return arrayOf(R.anim.slide_in_up, R.anim.slide_out_up)
    }

    fun InDown(): Array<Int> {
        return arrayOf(R.anim.slide_in_down, R.anim.slide_out_down)
    }

    fun InLeft(): Array<Int> {
        return arrayOf(R.anim.slide_in_left, R.anim.slide_out_right)
    }

    fun InRight(): Array<Int> {
        return arrayOf(R.anim.slide_in_right, R.anim.slide_out_left)
    }
}