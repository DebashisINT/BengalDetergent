package com.bengaldetergentfsm.features.photoReg.present

import com.bengaldetergentfsm.app.domain.ProspectEntity
import com.bengaldetergentfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}