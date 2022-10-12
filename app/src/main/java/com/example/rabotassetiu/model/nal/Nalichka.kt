package com.example.rabotassetiu.model.nal

data class Nalichka(
    val Date: String,
    val PreviousDate: String,
    val PreviousURL: String,
    val Timestamp: String,
    val Valute: Map<String, UValute>
)