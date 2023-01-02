package com.bengaldetergentfsm.features.lead.api

import com.bengaldetergentfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.bengaldetergentfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}