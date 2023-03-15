package com.codinginflow.mvvmtodo

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TasksViewModel @Inject constructor(val dao: TaskDao): ViewModel() {
    val tasks: LiveData<List<Task>> = dao.getTasks().asLiveData()
}