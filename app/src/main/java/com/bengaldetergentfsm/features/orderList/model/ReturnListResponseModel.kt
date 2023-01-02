package com.bengaldetergentfsm.features.orderList.model

import com.bengaldetergentfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}