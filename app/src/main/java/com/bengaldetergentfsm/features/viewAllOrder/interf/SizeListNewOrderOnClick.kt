package com.bengaldetergentfsm.features.viewAllOrder.interf

import com.bengaldetergentfsm.app.domain.NewOrderProductEntity
import com.bengaldetergentfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}