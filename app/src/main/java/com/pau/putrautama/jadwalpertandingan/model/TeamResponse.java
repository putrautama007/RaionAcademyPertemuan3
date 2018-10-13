package com.pau.putrautama.jadwalpertandingan.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TeamResponse {
    @SerializedName("teams")
    private List<TeamList> teamList;
}
