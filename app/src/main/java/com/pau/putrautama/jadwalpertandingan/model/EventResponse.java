package com.pau.putrautama.jadwalpertandingan.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EventResponse {
    @SerializedName("events")
    private List<EventList> eventResponse;

    public List<EventList> getEventResponse() {
        return eventResponse;
    }

}
