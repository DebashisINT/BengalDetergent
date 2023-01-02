package com.bengaldetergentfsm.features.survey.api

import com.bengaldetergentfsm.features.photoReg.api.GetUserListPhotoRegApi
import com.bengaldetergentfsm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}