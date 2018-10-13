package com.pau.putrautama.jadwalpertandingan.model;

import com.google.gson.annotations.SerializedName;

public class EventList {

    @SerializedName("idEvent")
    private String eventId;

    @SerializedName("strHomeTeam")
    private String homeTeam;

    @SerializedName("strAwayTeam")
    private String awayTeam;

    @SerializedName("intHomeScore")
    private String homeScore;

    @SerializedName("intAwayScore")
    private String awayScore;

    @SerializedName("dateEvent")
    private String eventDate;

    @SerializedName("strHomeLineupGoalkeeper")
    private String homeLineupGoalkeeper;

    @SerializedName("strAwayLineupGoalkeeper")
    private String awayLineupGoalkeeper;

    @SerializedName("strHomeGoalDetails")
    private String homeGoalDetails;

    @SerializedName("strAwayGoalDetails")
    private String awayGoalDetails;

    @SerializedName("intHomeShots")
    private String homeShots;

    @SerializedName("intAwayShots")
    private String awayShots;

    @SerializedName("strHomeLineupDefense")
    private String homeLineupDefense;

    @SerializedName("strAwayLineupDefense")
    private String awayLineupDefense;

    @SerializedName("strHomeLineupMidfield")
    private String homeLineupmidfield;

    @SerializedName("strAwayLineupMidfield")
    private String awayLineupMidfield;

    @SerializedName("strHomeLineupForward")
    private String homeLineupForward;

    @SerializedName("strAwayLineupForward")
    private String awayLineupForward;

    @SerializedName("strHomeLineupSubstitutes")
    private String homeLineupSubstitutes;

    @SerializedName("strAwayLineupSubstitutes")
    private String awayLineupSubstitutes;

    @SerializedName("strHomeFormation")
    private String homeFormation;

    @SerializedName("strAwayFormation")
    private String awayFormation;

    @SerializedName("strTeamBadge")
    private String teamBadge;

    @SerializedName("idHomeTeam")
    private String homeTeamId;

    @SerializedName("idAwayTeam")
    private String awayTeamId;

    public EventList() {
    }

    public EventList(String eventId, String homeTeam,
                     String awayTeam, String homeScore,
                     String awayScore, String eventDate,
                     String homeLineupGoalkeeper,
                     String awayLineupGoalkeeper, String homeGoalDetails,
                     String awayGoalDetails, String homeShots,
                     String awayShots, String homeLineupDefense,
                     String awayLineupDefense, String homeLineupmidfield,
                     String awayLineupMidfield, String homeLineupForward,
                     String awayLineupForward, String homeLineupSubstitutes,
                     String awayLineupSubstitutes, String homeFormation,
                     String awayFormation, String teamBadge,
                     String homeTeamId, String awayTeamId) {
        this.eventId = eventId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.eventDate = eventDate;
        this.homeLineupGoalkeeper = homeLineupGoalkeeper;
        this.awayLineupGoalkeeper = awayLineupGoalkeeper;
        this.homeGoalDetails = homeGoalDetails;
        this.awayGoalDetails = awayGoalDetails;
        this.homeShots = homeShots;
        this.awayShots = awayShots;
        this.homeLineupDefense = homeLineupDefense;
        this.awayLineupDefense = awayLineupDefense;
        this.homeLineupmidfield = homeLineupmidfield;
        this.awayLineupMidfield = awayLineupMidfield;
        this.homeLineupForward = homeLineupForward;
        this.awayLineupForward = awayLineupForward;
        this.homeLineupSubstitutes = homeLineupSubstitutes;
        this.awayLineupSubstitutes = awayLineupSubstitutes;
        this.homeFormation = homeFormation;
        this.awayFormation = awayFormation;
        this.teamBadge = teamBadge;
        this.homeTeamId = homeTeamId;
        this.awayTeamId = awayTeamId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(String homeScore) {
        this.homeScore = homeScore;
    }

    public String getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(String awayScore) {
        this.awayScore = awayScore;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getHomeLineupGoalkeeper() {
        return homeLineupGoalkeeper;
    }

    public void setHomeLineupGoalkeeper(String homeLineupGoalkeeper) {
        this.homeLineupGoalkeeper = homeLineupGoalkeeper;
    }

    public String getAwayLineupGoalkeeper() {
        return awayLineupGoalkeeper;
    }

    public void setAwayLineupGoalkeeper(String awayLineupGoalkeeper) {
        this.awayLineupGoalkeeper = awayLineupGoalkeeper;
    }

    public String getHomeGoalDetails() {
        return homeGoalDetails;
    }

    public void setHomeGoalDetails(String homeGoalDetails) {
        this.homeGoalDetails = homeGoalDetails;
    }

    public String getAwayGoalDetails() {
        return awayGoalDetails;
    }

    public void setAwayGoalDetails(String awayGoalDetails) {
        this.awayGoalDetails = awayGoalDetails;
    }

    public String getHomeShots() {
        return homeShots;
    }

    public void setHomeShots(String homeShots) {
        this.homeShots = homeShots;
    }

    public String getAwayShots() {
        return awayShots;
    }

    public void setAwayShots(String awayShots) {
        this.awayShots = awayShots;
    }

    public String getHomeLineupDefense() {
        return homeLineupDefense;
    }

    public void setHomeLineupDefense(String homeLineupDefense) {
        this.homeLineupDefense = homeLineupDefense;
    }

    public String getAwayLineupDefense() {
        return awayLineupDefense;
    }

    public void setAwayLineupDefense(String awayLineupDefense) {
        this.awayLineupDefense = awayLineupDefense;
    }

    public String getHomeLineupmidfield() {
        return homeLineupmidfield;
    }

    public void setHomeLineupmidfield(String homeLineupmidfield) {
        this.homeLineupmidfield = homeLineupmidfield;
    }

    public String getAwayLineupMidfield() {
        return awayLineupMidfield;
    }

    public void setAwayLineupMidfield(String awayLineupMidfield) {
        this.awayLineupMidfield = awayLineupMidfield;
    }

    public String getHomeLineupForward() {
        return homeLineupForward;
    }

    public void setHomeLineupForward(String homeLineupForward) {
        this.homeLineupForward = homeLineupForward;
    }

    public String getAwayLineupForward() {
        return awayLineupForward;
    }

    public void setAwayLineupForward(String awayLineupForward) {
        this.awayLineupForward = awayLineupForward;
    }

    public String getHomeLineupSubstitutes() {
        return homeLineupSubstitutes;
    }

    public void setHomeLineupSubstitutes(String homeLineupSubstitutes) {
        this.homeLineupSubstitutes = homeLineupSubstitutes;
    }

    public String getAwayLineupSubstitutes() {
        return awayLineupSubstitutes;
    }

    public void setAwayLineupSubstitutes(String awayLineupSubstitutes) {
        this.awayLineupSubstitutes = awayLineupSubstitutes;
    }

    public String getHomeFormation() {
        return homeFormation;
    }

    public void setHomeFormation(String homeFormation) {
        this.homeFormation = homeFormation;
    }

    public String getAwayFormation() {
        return awayFormation;
    }

    public void setAwayFormation(String awayFormation) {
        this.awayFormation = awayFormation;
    }

    public String getTeamBadge() {
        return teamBadge;
    }

    public void setTeamBadge(String teamBadge) {
        this.teamBadge = teamBadge;
    }

    public String getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(String homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public String getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(String awayTeamId) {
        this.awayTeamId = awayTeamId;
    }
}
