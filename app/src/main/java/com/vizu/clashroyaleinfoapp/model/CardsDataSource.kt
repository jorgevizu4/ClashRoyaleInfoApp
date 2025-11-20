package com.vizu.clashroyaleinfoapp.model

import com.vizu.clashroyaleinfoapp.R
import com.vizu.clashroyaleinfoapp.data.CardData

object CardsDataSource {
    val cards = listOf(
        CardData(
            name = R.string.zappies_name,
            description = R.string.zappies_description,
            imageResourceId = R.drawable.zappies,
            elixir = R.string.four_elixir,
            category = R.string.special,
            type = R.string.troop
        ),
        CardData(
            name = R.string.minions_name,
            description = R.string.minions_description,
            imageResourceId = R.drawable.minions,
            elixir = R.string.three_elixir,
            category = R.string.common,
            type = R.string.troop
        ),
        CardData(
            name = R.string.golem_name,
            description = R.string.golem_description,
            imageResourceId = R.drawable.golem,
            elixir = R.string.eight_elixir,
            category = R.string.epic,
            type = R.string.troop
        ),
        CardData(
            name = R.string.vines_name,
            description = R.string.vines_description,
            imageResourceId = R.drawable.vines,
            elixir = R.string.three_elixir,
            category = R.string.epic,
            type = R.string.spell
        ),
        CardData(
            name = R.string.mini_pekka_name,
            description = R.string.mini_pekka_description,
            imageResourceId = R.drawable.mini_pekka,
            elixir = R.string.four_elixir,
            category = R.string.special,
            type = R.string.troop
        ),
    )
}