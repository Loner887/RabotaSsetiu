package com.example.rabotassetiu.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rabotassetiu.data.repository.Repository
import com.example.rabotassetiu.model.beznal.BeznalItem
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel: ViewModel() {

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<BeznalItem>> = MutableLiveData()

    fun getBeznalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repo.getBeznal()
        }
    }
}