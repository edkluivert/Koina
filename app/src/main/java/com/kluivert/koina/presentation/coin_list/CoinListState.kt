package com.kluivert.koina.presentation.coin_list

import com.kluivert.koina.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
