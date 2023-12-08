package com.gmlab.team_benew.main.notification

import com.google.gson.annotations.SerializedName

data class NotificationMatchingResponse(
    @SerializedName("id")
    val id: Long,

    @SerializedName("message")
    val message: String,

    @SerializedName("read")
    val read: Boolean,

    @SerializedName("receiverUserId")
    val receiverUserId: Long,

    @SerializedName("senderUserId")
    val senderUserId: Long,

)
