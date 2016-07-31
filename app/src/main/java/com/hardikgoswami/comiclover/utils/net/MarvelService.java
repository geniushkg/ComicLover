package com.hardikgoswami.comiclover.utils.net;

import com.hardikgoswami.comiclover.utils.entity.CharactersResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by geniushkg on 7/31/2016.
 */
public interface MarvelService {
    @GET("characters")
    Call<CharactersResult> getCharacters(@Query("ts")String timeStamp, @Query("apikey") String apiKey , @Query("hash") String hash);
}
