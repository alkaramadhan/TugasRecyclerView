package com.example.windows.tugasrecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSenjata;
    private ArrayList<Senjata> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSenjata = findViewById(R.id.rv_senjata);
        rvSenjata.setHasFixedSize(true);

        list.addAll(SenjataData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rvSenjata.setLayoutManager(new LinearLayoutManager(this));
        CardViewSenjataAdapter cardViewSenjataAdapter = new CardViewSenjataAdapter(list);
        rvSenjata.setAdapter(cardViewSenjataAdapter);
    }

}
