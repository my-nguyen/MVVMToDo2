package com.codinginflow.mvvmtodo

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TasksViewModel @Inject constructor(val dao: TaskDao): ViewModel() {
}