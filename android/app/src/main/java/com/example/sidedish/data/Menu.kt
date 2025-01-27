package com.example.sidedish.data

import com.example.sidedish.data.dto.DetailImageLinkDTO

data class Menu(
    val description: String?,
    val discountPolicy: String?,
    val discountRate: Int?,
    val id: Int?,
    val mainImageLink: String?,
    val name: String?,
    val price: Int?,
    val detailImageLink: List<DetailImageLinks>? = null
): MenuModel()

data class DetailImageLinks(
    val id: Int?,
    val imageLink: String?
)