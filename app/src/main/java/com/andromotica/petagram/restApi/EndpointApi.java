package com.andromotica.petagram.restApi;

import com.andromotica.petagram.restApi.model.PetResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EndpointApi {

    @GET(ConstantesResApi.URL_GET_RECENT_MEDIA_USER_BETELUCANELU)
    Call<PetResponse> getAllMediaBeteluCanelu();

    @GET("me/media?fields=id,media_url,caption,timestamp,media_type,permalink,thumbnail_url,username&access_token=IGQVJWSHFEdDlFQVZAVYXIyX2M1RUkyU09ZAQ2pqcFViTFo2TzhEZAjdBLTRiUTltN2UxSEp2Mi1VWkN6OHl3RV96SVlWN1AxSHpvMWhsQTlYLTdkZA0g1YkxZASlNkZATdndk9icTEydHZAn")
    Call<PetResponse> getAllMediaAlexander8651();
}
