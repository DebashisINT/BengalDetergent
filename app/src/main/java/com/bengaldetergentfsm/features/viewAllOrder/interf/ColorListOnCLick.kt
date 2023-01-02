package com.bengaldetergentfsm.features.viewAllOrder.interf

import com.bengaldetergentfsm.app.domain.NewOrderGenderEntity
import com.bengaldetergentfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}