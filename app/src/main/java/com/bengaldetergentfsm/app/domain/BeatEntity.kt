package com.bengaldetergentfsm.app.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.bengaldetergentfsm.app.AppConstant

@Entity(tableName = AppConstant.BEAT_TABLE)
class BeatEntity {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0

    @ColumnInfo(name = "beat_id")
    var beat_id: String? = null

    @ColumnInfo(name = "name")
    var name: String? = null
}