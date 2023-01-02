package com.bengaldetergentfsm.features.newcollectionreport

import com.bengaldetergentfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}