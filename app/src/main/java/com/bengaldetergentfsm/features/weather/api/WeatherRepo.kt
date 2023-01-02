package com.bengaldetergentfsm.features.weather.api

import com.bengaldetergentfsm.base.BaseResponse
import com.bengaldetergentfsm.features.task.api.TaskApi
import com.bengaldetergentfsm.features.task.model.AddTaskInputModel
import com.bengaldetergentfsm.features.weather.model.ForeCastAPIResponse
import com.bengaldetergentfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}