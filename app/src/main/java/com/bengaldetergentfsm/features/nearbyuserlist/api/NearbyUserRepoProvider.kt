package com.bengaldetergentfsm.features.nearbyuserlist.api



object NearbyUserRepoProvider {
    fun getNearbyUserListRepository(): NearbyUserRepo {
        return NearbyUserRepo(NearbyUserApi.create())
    }
}