package com.bengaldetergentfsm.features.weather.api

import com.bengaldetergentfsm.features.task.api.TaskApi
import com.bengaldetergentfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}