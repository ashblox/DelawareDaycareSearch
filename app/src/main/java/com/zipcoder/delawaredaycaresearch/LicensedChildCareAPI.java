package com.zipcoder.delawaredaycaresearch;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface LicensedChildCareAPI {

    @Headers("X-App-Token: redacted")

//    @GET("?$where=delaware_stars_level::number>=4")
    @GET("?$where=resource_type='{type}'")
    Call<List<Daycare>> get5StarDaycares(@Path("type") String type);
}
