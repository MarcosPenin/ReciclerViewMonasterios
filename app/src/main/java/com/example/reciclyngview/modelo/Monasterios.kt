package com.example.reciclyngview.modelo

import android.content.res.Resources
import com.example.reciclyngview.R

fun flowerList(resources: Resources): List<Monasterio> {
    return listOf(
        Monasterio(
            id = 1,
            nombre = "Sobrado dos monxes",
            image = R.drawable.sobrado,
            descripcion = "Descripción genérica"
        ),
        Monasterio(
            id = 2,
            nombre = "San Pedro de Rocas",
            image = R.drawable.pedroderocas,
            descripcion = "Descripción genérica"
        ),
        Monasterio(
            id = 3,
            nombre = "Aciveiro",
            image = R.drawable.aciveiro,
            descripcion = "Descripción genérica"
        ),
        Monasterio(
            id = 4,
            nombre = "Oseira",
            image = R.drawable.oseira,
            descripcion = "Descripción genérica"
        ),
        Monasterio(
            id = 5,
            nombre= "Armenteira",
            image = R.drawable.armenteira,
            descripcion = "Descripción genérica"
        ),
        Monasterio(
            id = 6,
            nombre = "Carboeiro",
            image = R.drawable.carboeiro,
            descripcion = "Descripción genérica"
        ),
        Monasterio(
            id = 7,
            nombre = "Caaveiro",
            image = R.drawable.caaveiro,
            descripcion = "Descripción genérica"
        ),
        Monasterio(
            id = 8,
            nombre = "Samos",
            image = R.drawable.samos,
            descripcion = "Descripción genérica"
        )
    )
}