package com.tkjen.core.data.mapper

import com.tkjen.core.model.User
import com.tkjen.core.network.entities.UserRemote


fun UserRemote.toModel() : User {
    return User(
        name = name ,
        phone = phone,
        username = username
    )
}