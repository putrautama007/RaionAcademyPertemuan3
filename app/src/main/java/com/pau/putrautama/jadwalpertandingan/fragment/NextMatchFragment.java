package com.pau.putrautama.jadwalpertandingan.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.pau.putrautama.jadwalpertandingan.R;
import com.pau.putrautama.jadwalpertandingan.adapter.MatchAdapter;
import com.pau.putrautama.jadwalpertandingan.api.Client;
import com.pau.putrautama.jadwalpertandingan.api.Service;
import com.pau.putrautama.jadwalpertandingan.model.EventList;
import com.pau.putrautama.jadwalpertandingan.model.EventResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NextMatchFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private MatchAdapter mMatchAdapter;
    private Service mService;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_next_match, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = view.findViewById(R.id.rv_next_match);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL,false));

        loadMoiveData();
    }

    private void loadMoiveData() {
        mService = Client.getClient().create(Service.class);
        Call<EventResponse> call = mService.getNextMatch();
        call.enqueue(new Callback<EventResponse>() {
            @Override
            public void onResponse(Call<EventResponse> call, Response<EventResponse> response) {
                List<EventList> eventLists = response.body().getEventResponse();
                mMatchAdapter = new MatchAdapter(eventLists,getContext());
                mRecyclerView.setAdapter(mMatchAdapter);
                mMatchAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<EventResponse> call, Throwable t) {

            }
        });


    }
}
