package com.bengaldetergentfsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.bengaldetergentfsm.app.FileUtils
import com.bengaldetergentfsm.base.BaseResponse
import com.bengaldetergentfsm.features.NewQuotation.model.*
import com.bengaldetergentfsm.features.addshop.model.AddShopRequestData
import com.bengaldetergentfsm.features.addshop.model.AddShopResponse
import com.bengaldetergentfsm.features.damageProduct.model.DamageProductResponseModel
import com.bengaldetergentfsm.features.damageProduct.model.delBreakageReq
import com.bengaldetergentfsm.features.damageProduct.model.viewAllBreakageReq
import com.bengaldetergentfsm.features.login.model.userconfig.UserConfigResponseModel
import com.bengaldetergentfsm.features.myjobs.model.WIPImageSubmit
import com.bengaldetergentfsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}