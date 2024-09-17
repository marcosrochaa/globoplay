package com.example.globoplay.model

import java.math.BigDecimal

data class Streams(
    val name: String,
    val price: BigDecimal?=null,
    val image: Int? = null,
    val description : String? = null,
    val title: String?
)
