package com.bengaldetergentfsm.features.login.model.productlistmodel

import com.bengaldetergentfsm.app.domain.ModelEntity
import com.bengaldetergentfsm.app.domain.ProductListEntity
import com.bengaldetergentfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}