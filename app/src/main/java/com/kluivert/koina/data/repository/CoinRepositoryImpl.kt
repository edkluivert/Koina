package com.kluivert.koina.data.repository

import com.kluivert.koina.data.remote.CoinPaprikaApi
import com.kluivert.koina.data.remote.dto.CoinDetailDto
import com.kluivert.koina.data.remote.dto.CoinDto
import com.kluivert.koina.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}