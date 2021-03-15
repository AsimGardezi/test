package com.disappears.android.model.response

import java.util.*

data class ConversationResponse(
        val conversationIds: LinkedHashMap<String, String>? = null,
        val controlIds: LinkedHashMap<String, String>? = null,
        val userControlMessages: List<ControlEvent>? = null)
