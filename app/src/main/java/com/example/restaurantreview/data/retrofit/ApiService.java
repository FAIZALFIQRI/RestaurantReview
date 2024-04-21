package com.example.restaurantreview.data.retrofit;

import com.example.restaurantreview.data.response.ResponseRestaurant;
import com.example.restaurantreview.ui.PostReviewResponse;

import retrofit2.Call;
import retrofit2.http.*;

public interface ApiService {
    @GET("detail/{id}")

    Call<ResponseRestaurant> getRestaurant(@Path("id") String id

    );

    @FormUrlEncoded
    @Headers({"Authorization: token 12345"})
    @POST("review")
    Call<PostReviewResponse> postReview(
            @Field("id") String id,
            @Field("name") String name,
            @Field("review") String review
    );
}