package com.pau.putrautama.jadwalpertandingan.model;

import com.google.gson.annotations.SerializedName;

public class TeamList {
    @SerializedName( "strTeamBadge")
    private String teamBadge;

    @SerializedName("idTeam")
    private String teamId;

    @SerializedName("strTeam")
    private String teamName;

    @SerializedName("intFormedYear")
    private String teamFormedYear;

    @SerializedName("strStadium")
    private String teamStadium;

    @SerializedName("strDescriptionEN")
    private String teamDescription;


    public TeamList() {
    }

    public String getTeamBadge() {
        return teamBadge;
    }

    public void setTeamBadge(String teamBadge) {
        this.teamBadge = teamBadge;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamFormedYear() {
        return teamFormedYear;
    }

    public void setTeamFormedYear(String teamFormedYear) {
        this.teamFormedYear = teamFormedYear;
    }

    public String getTeamStadium() {
        return teamStadium;
    }

    public void setTeamStadium(String teamStadium) {
        this.teamStadium = teamStadium;
    }

    public String getTeamDescription() {
        return teamDescription;
    }

    public void setTeamDescription(String teamDescription) {
        this.teamDescription = teamDescription;
    }
}
