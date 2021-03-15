package com.disappears.android.model

class PhoneNumber(
        var rawContactId: Long = 0,
        var dataId: Long = 0,
        var number: String? = null,
        val customTypeLabel: String? = null,
        var normalizedNumber: String? = null)

