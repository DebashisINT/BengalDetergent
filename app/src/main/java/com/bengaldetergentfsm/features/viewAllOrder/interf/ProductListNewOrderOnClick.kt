package com.bengaldetergentfsm.features.viewAllOrder.interf

import com.bengaldetergentfsm.app.domain.NewOrderGenderEntity
import com.bengaldetergentfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}