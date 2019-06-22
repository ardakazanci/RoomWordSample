package com.ardakazanci.roomwordsample.repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.ardakazanci.roomwordsample.dao.WordDao
import com.ardakazanci.roomwordsample.room.Word

class WordRepository(private val wordDao:WordDao) {

    val allWords: LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }

}