package com.pau.putrautama.jadwalpertandingan.api;

import com.pau.putrautama.jadwalpertandingan.model.EventResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("eventspastleague.php?id=4328")
    Call<EventResponse> getPrevMatch();

    @GET("eventsnextleague.php?id=4328")
    Call<EventResponse> getNextMatch();
}
