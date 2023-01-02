package com.bengaldetergentfsm.features.viewAllOrder.interf

import com.bengaldetergentfsm.app.domain.NewOrderColorEntity
import com.bengaldetergentfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}