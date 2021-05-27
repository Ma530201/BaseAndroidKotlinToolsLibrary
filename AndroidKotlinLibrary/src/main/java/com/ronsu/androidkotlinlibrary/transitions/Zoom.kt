package com.ronsu.androidkotlinlibrary.transitions

import com.ronsu.androidkotlinlibrary.R

/**
 * 專案名稱:BaseAndroidKotlinToolsLibrary
 * 類描述: * 建立人:Playsuer-Ron
 * 建立時間:2021/5/27 上午 09:51
 * 修改人:Playsuer-Ron
 * 修改時間:2021/5/27 上午 09:51
 * 修改備註: * @version */

/**
 * val transitions = Transitions(this@LoadActivity)
 * transitions.setAnimation(Zoom().In())
 **/
class Zoom {
    fun In(): Array<Int> {
        return arrayOf(R.anim.zoom_in, R.anim.zoom_out)
    }
}