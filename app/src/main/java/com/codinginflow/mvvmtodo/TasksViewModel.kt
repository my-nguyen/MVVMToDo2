package com.codinginflow.mvvmtodo

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class TasksViewModel @Inject constructor(val dao: TaskDao): ViewModel() {
}