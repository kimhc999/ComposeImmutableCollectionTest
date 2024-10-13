package com.sample.composeimmutablecollectiontest.model

import kotlinx.collections.immutable.ImmutableList

data class ImmutableListTestModel(
    val testList: ImmutableList<String>
)