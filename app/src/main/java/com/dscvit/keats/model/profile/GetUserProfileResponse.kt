package com.dscvit.keats.model.profile

import com.squareup.moshi.Json

data class GetUserProfileResponse(
    @Json(name = "data")
    val User: UserEntity,
    @Json(name = "status")
    val Status: String
)
