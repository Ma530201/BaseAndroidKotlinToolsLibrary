package com.ronsu.androidkotlinlibrary.transitions

import com.ronsu.androidkotlinlibrary.R

/**
 * 專案名稱:BaseAndroidKotlinToolsLibrary
 * 類描述: * 建立人:Playsuer-Ron
 * 建立時間:2021/5/27 上午 09:49
 * 修改人:Playsuer-Ron
 * 修改時間:2021/5/27 上午 09:49
 * 修改備註: * @version */

/**
 * val transitions = Transitions(this@LoadActivity)
 * transitions.setAnimation(Flip().In())
 **/
class Flip {
    fun InX(): Array<Int> {
        return arrayOf(R.anim.flip_in_x, R.anim.flip_out_x)
    }
}