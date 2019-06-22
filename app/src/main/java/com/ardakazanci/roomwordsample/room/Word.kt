package com.ardakazanci.roomwordsample.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * @Entity(tableName = "word_table") Tablo Adı
 * @PrimaryKey : tabloyu dolduracak word nesneleri birincil anahtar olacak.
 * @ColumnInfo(name = "word") : Sütun adı word olacak
 */


@Entity(tableName = "word_table")
data class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)