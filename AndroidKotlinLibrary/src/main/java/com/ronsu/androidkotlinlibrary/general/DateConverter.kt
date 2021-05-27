package com.ronsu.androidkotlinlibrary.general

import androidx.room.TypeConverter
import kotlinx.android.parcel.TypeParceler
import java.util.*

/**
 * 專案名稱:BaseAndroidKotlinToolsLibrary
 * 類描述: * 建立人:Playsuer-Ron
 * 建立時間:2021/5/27 下午 04:57
 * 修改人:Playsuer-Ron
 * 修改時間:2021/5/27 下午 04:57
 * 修改備註: 時間轉換*/
class DateConverter {

    @TypeConverter
    fun fromTimestamp(value:Long?): Date?{
       return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date:Date?):Long?{
        return date?.time
    }

}