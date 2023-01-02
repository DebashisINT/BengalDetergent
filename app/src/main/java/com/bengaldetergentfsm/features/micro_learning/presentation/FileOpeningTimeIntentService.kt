package com.bengaldetergentfsm.features.micro_learning.presentation

import android.app.IntentService
import android.content.Intent
import com.bengaldetergentfsm.R
import com.bengaldetergentfsm.app.NetworkConstant
import com.bengaldetergentfsm.app.Pref
import com.bengaldetergentfsm.app.utils.AppUtils
import com.bengaldetergentfsm.app.utils.Toaster
import com.bengaldetergentfsm.base.BaseResponse
import com.bengaldetergentfsm.base.presentation.BaseActivity
import com.bengaldetergentfsm.features.dashboard.presentation.DashboardActivity
import com.bengaldetergentfsm.features.micro_learning.api.MicroLearningRepoProvider
import com.elvishew.xlog.XLog
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class FileOpeningTimeIntentService : IntentService("") {

    override fun onHandleIntent(p0: Intent?) {

        val id = p0?.getStringExtra("id")
        val startTime = p0?.getStringExtra("start_time")

        val repository = MicroLearningRepoProvider.microLearningRepoProvider()
        BaseActivity.compositeDisposable.add(
                repository.updateFileOpeningTime(id!!, startTime!!)
                        .subscribe({ result ->
                            val response = result as BaseResponse
                            XLog.d("UPDATE FILE OPENING TIME: " + "RESPONSE : " + response.status + "\n" + "Time : " + AppUtils.getCurrentDateTime() + ", USER :" + Pref.user_name + ",MESSAGE : " + response.message)
                        }, { error ->
                            XLog.d("UPDATE FILE OPENING TIME: " + "ERROR : " + "\n" + "Time : " + AppUtils.getCurrentDateTime() + ", USER :" + Pref.user_name + ",MESSAGE : " + error.localizedMessage)
                            error.printStackTrace()
                        })
        )
    }
}