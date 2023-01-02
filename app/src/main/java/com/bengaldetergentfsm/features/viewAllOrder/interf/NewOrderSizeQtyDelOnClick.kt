package com.bengaldetergentfsm.features.viewAllOrder.interf

import com.bengaldetergentfsm.app.domain.NewOrderGenderEntity
import com.bengaldetergentfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}