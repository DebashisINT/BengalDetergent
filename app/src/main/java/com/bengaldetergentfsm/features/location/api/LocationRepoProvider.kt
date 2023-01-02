package com.bengaldetergentfsm.features.location.api

import com.bengaldetergentfsm.features.location.shopdurationapi.ShopDurationApi
import com.bengaldetergentfsm.features.location.shopdurationapi.ShopDurationRepository

/**
 * Created by Saikat on 17-Aug-20.
 */
object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}