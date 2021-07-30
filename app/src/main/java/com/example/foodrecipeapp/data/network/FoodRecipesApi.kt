package com.example.foodrecipeapp.data.network
import com.example.foodrecipeapp.models.FoodRecipe
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRecipesApi {

    @GET("/recipes/complexSearch")
    suspend fun getRecipes(
        @QueryMap queries: Map<String, String>
    ):Response<FoodRecipe>

}