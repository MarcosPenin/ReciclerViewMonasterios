package com.example.reciclyngview.modelo

import androidx.annotation.DrawableRes

data class Monasterio(
    val id: Long,
    val nombre: String,
    @DrawableRes
    val image: Int?,
    val descripcion: String
)