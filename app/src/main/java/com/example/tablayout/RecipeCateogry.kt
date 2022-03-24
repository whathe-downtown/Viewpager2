package com.example.tablayout

import androidx.annotation.StringRes

enum class RecipeCateogry(
    @StringRes val categoryNameId: Int,
    @StringRes val categoryTypeId: Int
) {
    MAIN_FOOD(R.string.main_food, R.string.main_food_type),
    SUB_FOOD (R.string.sub_food, R.string.sub_food_type),
    DUMPLING_FOOD(R.string.dumpling_food, R.string.dumpling_food_type),
    KOREAN_FOOD(R.string.korean_food, R.string.korean_food_type),
    CHINESE_FOOD(R.string.chinese_food, R.string.chinese_food_type),
    ASIAN_EUROPE_FOOD(R.string.asian_europe_food, R.string.asian_europe_food_type),
    JAPANESE_FOOD(R.string.japanese_food, R.string.japanese_food_type),
    CAFE_DESSERT(R.string.cafe_dessert, R.string.cafe_dessert_type),



}