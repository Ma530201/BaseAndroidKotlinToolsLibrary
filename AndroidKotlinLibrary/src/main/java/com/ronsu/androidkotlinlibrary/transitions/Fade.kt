package com.ronsu.androidkotlinlibrary.transitions

import com.ronsu.androidkotlinlibrary.R

/**
 * 專案名稱:BaseAndroidKotlinToolsLibrary
 * 類描述: * 建立人:Playsuer-Ron
 * 建立時間:2021/5/27 上午 09:48
 * 修改人:Playsuer-Ron
 * 修改時間:2021/5/27 上午 09:48
 * 修改備註: * @version */

/**
 *  val transitions = Transitions(this@LoadActivity)
 *  transitions.setAnimation(Fade().In())
 **/
class Fade {
    fun In(): Array<Int> {
        return arrayOf(R.anim.fade_in, R.anim.fade_out)
    }

    fun InUp(): Array<Int> {
        return arrayOf(R.anim.fade_in_up, R.anim.fade_out_up)
    }

    fun InDown(): Array<Int> {
        return arrayOf(R.anim.fade_in_down, R.anim.fade_out_down)
    }

    fun InLeft(): Array<Int> {
        return arrayOf(R.anim.fade_in_left, R.anim.fade_out_right)
    }

    fun InRight(): Array<Int> {
        return arrayOf(R.anim.fade_in_right, R.anim.fade_out_left)
    }
}