package com.nabilah_19104025.modul9

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SettingModel (
    var name: String? = null,
    var email: String? = null,
    var age: Int = 0,
    var phoneNumber: String? = null,
    var land: String? = null,
    var job: String? = null,
    var isDarkTheme: Boolean = false
): Parcelable