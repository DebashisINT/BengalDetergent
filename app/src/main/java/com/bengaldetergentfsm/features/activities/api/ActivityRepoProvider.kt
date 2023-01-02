package com.bengaldetergentfsm.features.activities.api

import com.bengaldetergentfsm.features.member.api.TeamApi
import com.bengaldetergentfsm.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}