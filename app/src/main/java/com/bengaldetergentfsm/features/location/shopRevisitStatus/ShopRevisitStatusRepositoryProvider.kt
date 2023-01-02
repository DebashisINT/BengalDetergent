package com.bengaldetergentfsm.features.location.shopRevisitStatus

import com.bengaldetergentfsm.features.location.shopdurationapi.ShopDurationApi
import com.bengaldetergentfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}