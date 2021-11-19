package com.kluivert.koina.presentation.coin_detail

import com.kluivert.koina.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
