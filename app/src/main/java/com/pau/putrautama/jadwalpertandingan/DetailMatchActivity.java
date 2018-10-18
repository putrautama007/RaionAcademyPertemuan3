package com.pau.putrautama.jadwalpertandingan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;
import com.pau.putrautama.jadwalpertandingan.model.EventList;

public class DetailMatchActivity extends AppCompatActivity {

    public static final String ITEM_MATCH = "item_match";

    TextView mMatchDate,mHomeTeam,mAwayTeam ,mMatchScore,
             mHomeLineupGoalkeeper,mAwayLineupGoalkeeper,
            mHomeGoalDetails,mAwayGoalDetails,mHomeShots,
            mAwayShots, mHomeLineupDefense, mAwayLineupDefense ,
            mHomeLineupMidfield, mAwayLineupMidfield ,HomeLineupForward ,
            mAwayLineupForward,mHomeLineupSubstitutes,mAwayLineupSubstitutes;

    private EventList eventList;
    private Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_match);
        setTitle(R.string.detail_match);

        setUpView();
        String json = getIntent().getStringExtra(ITEM_MATCH);
        eventList = gson.fromJson(json, EventList.class);
        loadData();
    }

    private void setUpView(){
        mMatchDate = findViewById(R.id.tv_match_date_detail);
        mHomeTeam = findViewById(R.id.tv_home_team_detail);
        mAwayTeam = findViewById(R.id.tv_away_team_detail);
        mMatchScore = findViewById(R.id.tv_match_score_detail);
        mHomeLineupGoalkeeper = findViewById(R.id.tv_goalkeeper_home_detail);
        mAwayLineupGoalkeeper = findViewById(R.id.tv_goalkeeper_away_detail);
        mHomeGoalDetails = findViewById(R.id.tv_goal_home_detail);
        mAwayGoalDetails = findViewById(R.id.tv_goal_away_detail);
        mHomeShots = findViewById(R.id.tv_shot_home_detail);
        mAwayShots = findViewById(R.id.tv_shot_away_detail);
        mHomeLineupDefense = findViewById(R.id.tv_defense_home_detail);
        mAwayLineupDefense = findViewById(R.id.tv_defense_away_detail);
        mHomeLineupMidfield = findViewById(R.id.tv_midfield_home_detail);
        mAwayLineupMidfield = findViewById(R.id.tv_midfield_away_detail);
        HomeLineupForward = findViewById(R.id.tv_forward_home_detail);
        mAwayLineupForward = findViewById(R.id.tv_forward_away_detail);
        mHomeLineupSubstitutes = findViewById(R.id.tv_substitute_home_detail);
        mAwayLineupSubstitutes = findViewById(R.id.tv_substitute_away_detail);
    }

    private void loadData() {

        if (eventList.getHomeScore() != null && eventList.getAwayScore() != null){
            mMatchDate.setText(eventList.getEventDate());
            mHomeTeam.setText(eventList.getHomeTeam());
            mAwayTeam.setText(eventList.getAwayTeam());
            mMatchScore.setText(eventList.getHomeScore() + " VS " + eventList.getAwayScore());
            mHomeLineupGoalkeeper.setText(eventList.getHomeLineupGoalkeeper());
            mAwayLineupGoalkeeper.setText(eventList.getAwayLineupGoalkeeper());
            mHomeGoalDetails.setText(eventList.getHomeGoalDetails());
            mAwayGoalDetails.setText(eventList.getAwayGoalDetails());
            mHomeShots.setText(eventList.getHomeShots());
            mAwayShots.setText(eventList.getAwayShots());
            mHomeLineupDefense.setText(eventList.getHomeLineupDefense());
            mAwayLineupDefense.setText(eventList.getAwayLineupDefense());
            mHomeLineupMidfield.setText(eventList.getHomeLineupmidfield());
            mAwayLineupMidfield.setText(eventList.getAwayLineupMidfield());
            HomeLineupForward.setText(eventList.getHomeLineupForward());
            mAwayLineupForward.setText(eventList.getAwayLineupForward());
            mHomeLineupSubstitutes.setText(eventList.getHomeLineupSubstitutes());
            mAwayLineupSubstitutes.setText(eventList.getAwayLineupSubstitutes());

        }else {
            mHomeTeam.setText(eventList.getHomeTeam());
            mAwayTeam.setText(eventList.getAwayTeam());
        }
    }
}
