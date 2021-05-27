package com.ronsu.androidkotlinlibrary.transitions

import android.app.Activity
import android.content.Context

/**
 * 專案名稱:BaseAndroidKotlinToolsLibrary
 * 類描述: * 建立人:Playsuer-Ron
 * 建立時間:2021/5/27 上午 09:50
 * 修改人:Playsuer-Ron
 * 修改時間:2021/5/27 上午 09:50
 * 修改備註: * @version */

/**
 * val transitions = Transitions(this@LoadActivity)
 * transitions.setAnimation(content,Transitions(arrayOf(R.anim.zoom_in, R.anim.zoom_out)))
 **/

class Transitions (private val context: Context) {
    /**
     * @param effects is animation array
     **/
    fun setAnimation(effects: Array<Int>) {
        (context as Activity).overridePendingTransition(effects[0], effects[1])
    }
}