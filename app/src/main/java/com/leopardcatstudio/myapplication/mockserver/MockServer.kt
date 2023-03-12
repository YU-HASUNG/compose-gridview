package com.leopardcatstudio.myapplication.mockserver

import com.leopardcatstudio.myapplication.R
import com.leopardcatstudio.myapplication.model.TestDataModel

object MockServer {

    fun fetchData(offset: Int, limit: Int): List<TestDataModel> {
        val list = mutableListOf<TestDataModel>()

        for(i in offset until (offset + limit)){

            if( i == 42) {
                return list
            }

            TestDataModel(
                index = i,
                imageResource = R.mipmap.ic_launcher,
                content = "grid item"
            ).apply{
                list.add(this)
            }
        }
        return list
    }
}