package com.bengaldetergentfsm.features.document.api

import com.bengaldetergentfsm.features.dymanicSection.api.DynamicApi
import com.bengaldetergentfsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}