package com.ronsu.androidkotlinlibrary.validation

import java.util.regex.Pattern

/**
 * 專案名稱:BaseAndroidKotlinToolsLibrary
 * 類描述: * 建立人:Playsuer-Ron
 * 建立時間:2021/5/27 上午 09:52
 * 修改人:Playsuer-Ron
 * 修改時間:2021/5/27 上午 09:52
 * 修改備註: * @version */
class ValidatorRegex {
    fun isEmailValid(email: String): Boolean {
        return Pattern.compile(
            "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
        ).matcher(email).matches()
    }

    fun isPhoneValid(phone: String): Boolean {
        return Pattern.compile(
            "^09[0-9]{8}\$"
        ).matcher(phone).matches()
    }

    /**
    ^ ＃字符串開頭
    (?=.*[0-9])＃一個數字必須至少出現一次
    (?=.*[a-z])＃一個小寫字母必須至少出現一次
    (?=.*[A-Z])＃一個大寫字母必須至少出現一次
    (?=.*[@#$%^&+=])＃一個特殊字符必須至少出現一次用您的特殊字符替換
    .{8,}＃任何內容，但至少應包含六個位置
     **/
    fun isPasswordValid(password: String): Boolean {
        return Pattern.compile(
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#\$%^&+=]).{8,}"
        ).matcher(password).matches()
    }

    /**
     * 手機載具驗證
     **/
    fun isPhoneCarrierValid(phoneCarrier: String): Boolean {
        return Pattern.compile(
            "^/{1}[0-9A-Z-]{7}\$"
        ).matcher(phoneCarrier).matches()
    }

    /**
     * 自然人載具驗證
     **/
    fun isPeopleCarrierValid(peopleCarrier: String): Boolean {
        return Pattern.compile(
            "^[a-zA-Z]{2}[0-9]{14}\$"
        ).matcher(peopleCarrier).matches()
    }

    /**
     *公司統編驗證(ubn)
     **/
    fun isCompanyIdValid(companyId: String): Boolean {
        return Pattern.compile(
            "^[0-9]{8}\$"
        ).matcher(companyId).matches()
    }
}