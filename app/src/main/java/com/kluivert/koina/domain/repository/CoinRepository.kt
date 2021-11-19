package com.kluivert.koina.domain.repository

import com.kluivert.koina.data.remote.dto.CoinDetailDto
import com.kluivert.koina.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}