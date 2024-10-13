package com.sample.composeimmutablecollectiontest.model

import androidx.compose.runtime.Stable

@Stable
data class ListTestStableModel(
    val testList: List<String>
)