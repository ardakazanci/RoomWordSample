package com.ardakazanci.roomwordsample.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.ardakazanci.roomwordsample.room.Word


@Dao
interface WordDao {


    /**
     * Veritabanına Word Nesnesi ekleme işlemi
     */
    @Insert
    suspend fun insert(word: Word)

    /**
     * Veritabanından tüm değerleri getirme, okuma işlemi
     */
    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getAllWords(): LiveData<List<Word>>


    /**
     * Veritabanından tüm değerleri silme işlemi
     */
    @Query("DELETE FROM word_table")
    fun deleteAll()

}


