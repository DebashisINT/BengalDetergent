package com.bengaldetergentfsm.features.dashboard.presentation.api.dayStartEnd

import com.bengaldetergentfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.bengaldetergentfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}