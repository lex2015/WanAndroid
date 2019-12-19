package com.kkaka.wanandroid.project.data

import android.arch.lifecycle.MutableLiveData
import com.kkaka.common.common.State
import com.kkaka.wanandroid.api.ApiRepository

/**
 * @author Laizexin on 2019/12/19
 * @description
 */
class ProjectRepository(val loadState : MutableLiveData<State>) : ApiRepository() {
}