package com.bengaldetergentfsm.features.nearbyuserlist.api

import com.bengaldetergentfsm.app.Pref
import com.bengaldetergentfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.bengaldetergentfsm.features.newcollection.model.NewCollectionListResponseModel
import com.bengaldetergentfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}