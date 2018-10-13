package com.pau.putrautama.jadwalpertandingan.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.gson.Gson;
import com.pau.putrautama.jadwalpertandingan.DetailMatchActivity;
import com.pau.putrautama.jadwalpertandingan.R;
import com.pau.putrautama.jadwalpertandingan.model.EventList;

import java.util.List;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.ViewHolder> {
    private List<EventList> mEventList;
    private Context mContext;

    public MatchAdapter(List<EventList> mEventList, Context mContext) {
        this.mEventList = mEventList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.match_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.mMatchDate.setText(mEventList.get(position).getEventDate());
        holder.mHomeTeam.setText(mEventList.get(position).getHomeTeam());
        holder.mAwayTeam.setText(mEventList.get(position).getAwayTeam());

        if (mEventList.get(position).getHomeScore() != null && mEventList.get(position).getAwayScore() != null){
            holder.mMatchScore.setText(mEventList.get(position).getHomeScore() + " VS " + mEventList.get(position).getAwayScore());
        }else {
            holder.mMatchScore.setText(" VS ");
        }
        holder.mMatchCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,DetailMatchActivity.class);
                EventList clickItem = mEventList.get(position);
                intent.putExtra(DetailMatchActivity.ITEM_MATCH, new Gson().toJson(clickItem));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mEventList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mMatchDate, mHomeTeam, mAwayTeam, mMatchScore;
        private CardView mMatchCard;

        public ViewHolder(View itemView) {
            super(itemView);
            mMatchDate = itemView.findViewById(R.id.match_date);
            mHomeTeam = itemView.findViewById(R.id.home_team);
            mAwayTeam = itemView.findViewById(R.id.away_team);
            mMatchScore = itemView.findViewById(R.id.match_score);
            mMatchCard = itemView.findViewById(R.id.cv_match_list);
        }
    }
}
