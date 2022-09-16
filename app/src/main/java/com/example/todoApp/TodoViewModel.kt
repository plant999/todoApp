package com.example.todoApp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class TodoViewModel(application: Application) : AndroidViewModel(application) {

    private val mtodoRepository: TodoRepository
    private val mAllTodos: LiveData<MutableList<Todo>>

    init {
        mtodoRepository = TodoRepository(application)
        mAllTodos = mtodoRepository.getAllTodos()
    }

    fun insert(todo: Todo) {
        mtodoRepository.insert(todo)
    }

    fun delete(todo: Todo) {
        mtodoRepository.delete(todo)
    }

    fun getAllTodos(): LiveData<MutableList<Todo>> {
        return mAllTodos;
    }
}