package com.disappears.android.api

import com.disappears.android.model.Message
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParseException
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer

import java.lang.reflect.Type

class MessageTypeAdapter : JsonSerializer<Message>, JsonDeserializer<Message> {
    @Throws(JsonParseException::class)
    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): Message {
        val obj = json.asJsonObject
        val m = Message()
        m.from = obj.get("from").asString
        m.to = obj.get("to").asString
        m.data = obj.get("data").asString
        m.dateTime = obj.get("datetime").asLong
        m.iv = obj.get("iv").asString
        m.numericId = obj.get("id").asInt
        m.fromVersion = obj.get("fromVersion").asString
        m.toVersion = obj.get("toVersion").asString
        m.mimeType = obj.get("mimeType").asString
        m.id = m.iv
        return m
    }

    override fun serialize(src: Message, typeOfSrc: Type, context: JsonSerializationContext): JsonElement {
        val obj = JsonObject()
        obj.addProperty("from", src.from)
        obj.addProperty("to", src.to)
        obj.addProperty("data", src.data)
        obj.addProperty("datetime", src.dateTime)
        obj.addProperty("iv", src.iv)
        obj.addProperty("fromVersion", src.fromVersion)
        obj.addProperty("toVersion", src.toVersion)
        obj.addProperty("mimeType", src.mimeType)
        return obj
    }
}
