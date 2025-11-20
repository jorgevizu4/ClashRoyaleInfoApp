package com.vizu.clashroyaleinfoapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CardData (
    @StringRes val name: Int,
    @StringRes val description: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val elixir : Int,
    @StringRes val category: Int,
    @StringRes val type: Int,
)