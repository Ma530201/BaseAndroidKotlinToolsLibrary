package com.ronsu.androidkotlinlibrary.general

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import java.text.SimpleDateFormat
import java.util.*

/**
 * 專案名稱:BaseAndroidKotlinToolsLibrary
 * 類描述: * 建立人:Playsuer-Ron
 * 建立時間:2021/5/27 上午 09:44
 * 修改人:Playsuer-Ron
 * 修改時間:2021/5/27 上午 09:44
 * 修改備註: * @version */
@Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class AppInfo {
//    fun getVersionName(context: Context): String {
//        return BuildConfig.VERSION_NAME
//    }
    fun getVersionName(context: Context): String {
        val packageManager = context.packageManager
        val packageInfo: PackageInfo
        var versionName = ""
        try {
            packageInfo = packageManager.getPackageInfo(context.packageName, 0)
            versionName = packageInfo.versionName.toString()
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
        return versionName
    }

//    fun getVersionCode(context: Context): Int {
//        return BuildConfig.VERSION_CODE
//    }
    fun getVersionCode(context: Context): Int {
        val packageManager = context.packageManager
        val packageInfo: PackageInfo
        var versionCode = 0
        try {
            packageInfo = packageManager.getPackageInfo(context.packageName, 0)
            versionCode = packageInfo.versionCode
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
        return versionCode
    }

//    fun getApplicationID(context: Context):String{
//        return BuildConfig.APPLICATION_ID
//    }

    /**
     * @param time 秒為單位
     * @param format 輸出時間字串格式
     * @param locale 時區
     **/
    fun StampToDate(time: Long, format: String, locale: Locale): String {
        val simpleDateFormat = SimpleDateFormat(format, locale)
        return simpleDateFormat.format(Date(time))
    }

    /**
     * @param date 時間字串
     * @param format 時間格式
     * @param locale 時區
     * @output 以豪秒為單位
     **/
    fun DateToStamp(date: String, format: String, locale: Locale): Long {
        val simpleDateFormat = SimpleDateFormat(format, locale)
        /// 輸出為毫秒為單位
        return simpleDateFormat.parse(date).time
    }

    /** set sharedPreferences string value **/
    @SuppressLint("ApplySharedPref")
    fun setSharedPreferencesStringValue(
        context: Context,
        preferencesName: String,
        privateLevel: Int,
        key: String,
        value: String
    ) {
        //Context.MODE_PRIVATE
        val pref = context.getSharedPreferences(preferencesName, privateLevel)
        pref.edit().putString(key, value).commit()
    }

    /** get sharedPreferences string value **/
    fun getSharedPreferencesStringValue(
        context: Context,
        preferencesName: String,
        privateLevel: Int,
        key: String
    ): String? {
        val pref = context.getSharedPreferences(preferencesName, privateLevel)
        return pref.getString(key, "")
    }

    /** set sharedPreferences int value **/
    @SuppressLint("ApplySharedPref")
    fun setSharedPreferencesIntValue(
        context: Context,
        preferencesName: String,
        privateLevel: Int,
        key: String,
        value: Int
    ) {
        //Context.MODE_PRIVATE
        val pref = context.getSharedPreferences(preferencesName, privateLevel)
        pref.edit().putInt(key, value).commit()
    }

    /** get sharedPreferences int value **/
    fun getSharedPreferencesIntValue(
        context: Context,
        preferencesName: String,
        privateLevel: Int,
        key: String
    ): Int? {
        val pref = context.getSharedPreferences(preferencesName, privateLevel)
        return pref.getInt(key, -1)
    }

    /** set sharedPreferences boolean value **/
    @SuppressLint("ApplySharedPref")
    fun setSharedPreferencesBooleanValue(
        context: Context,
        preferencesName: String,
        privateLevel: Int,
        key: String,
        value: Boolean
    ) {
        //Context.MODE_PRIVATE
        val pref = context.getSharedPreferences(preferencesName, privateLevel)
        pref.edit().putBoolean(key, value).commit()
    }

    /** get sharedPreferences boolean value **/
    fun getSharedPreferencesBooleanValue(
        context: Context,
        preferencesName: String,
        privateLevel: Int,
        key: String
    ): Boolean? {
        val pref = context.getSharedPreferences(preferencesName, privateLevel)
        return pref.getBoolean(key, false)
    }

    /** set sharedPreferences float value **/
    @SuppressLint("ApplySharedPref")
    fun setSharedPreferencesFloatValue(
        context: Context,
        preferencesName: String,
        privateLevel: Int,
        key: String,
        value: Float
    ) {
        //Context.MODE_PRIVATE
        val pref = context.getSharedPreferences(preferencesName, privateLevel)
        pref.edit().putFloat(key, value).commit()
    }

    /** get sharedPreferences float value **/
    fun getSharedPreferencesFloatValue(
        context: Context,
        preferencesName: String,
        privateLevel: Int,
        key: String
    ): Float? {
        val pref = context.getSharedPreferences(preferencesName, privateLevel)
        return pref.getFloat(key, 0f)
    }

    /** set sharedPreferences long value **/
    @SuppressLint("ApplySharedPref")
    fun setSharedPreferencesLongValue(
        context: Context,
        preferencesName: String,
        privateLevel: Int,
        key: String,
        value: Long
    ) {
        //Context.MODE_PRIVATE
        val pref = context.getSharedPreferences(preferencesName, privateLevel)
        pref.edit().putLong(key, value).commit()
    }

    /** get sharedPreferences Long value **/
    fun getSharedPreferencesLongValue(
        context: Context,
        preferencesName: String,
        privateLevel: Int,
        key: String
    ): Long? {
        val pref = context.getSharedPreferences(preferencesName, privateLevel)
        return pref.getLong(key, 0)
    }

}