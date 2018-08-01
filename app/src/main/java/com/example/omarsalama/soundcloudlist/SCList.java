package com.example.omarsalama.soundcloudlist;

import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.ArrayList;

import Adapters.SongsListAdapter;

public class SCList extends AppCompatActivity {

    RecyclerView recyclerView;
    SongsListAdapter adapter;
    ArrayList<Song> songs;
    LinearLayoutManager manager;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sclist);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView=findViewById(R.id.songslist);
        songs=new ArrayList<>();
        songs.add(new Song("Ronaldo","Mourinho","33:55", getDrawable(R.drawable.siu),"25000m"));
        songs.add(new Song("Messi","Guardiola","3:55", getDrawable(R.drawable.siu),"25000m"));
        songs.add(new Song("Ronaldo","Mourinho","33:55", getDrawable(R.drawable.siu),"25000m"));
        songs.add(new Song("Ronaldo","Mourinho","33:55", getDrawable(R.drawable.siu),"25000m"));
        songs.add(new Song("Ronaldo","Mourinho","33:55", getDrawable(R.drawable.siu),"25000m"));
        songs.add(new Song("Ronaldo","Mourinho","33:55", getDrawable(R.drawable.siu),"25000m"));
        songs.add(new Song("Ronaldo","Mourinho","33:55", getDrawable(R.drawable.siu),"25000m"));
        songs.add(new Song("Ronaldo","Mourinho","33:55", getDrawable(R.drawable.siu),"25000m"));
        songs.add(new Song("Ronaldo","Mourinho","33:55", getDrawable(R.drawable.siu),"25000m"));

        manager=new LinearLayoutManager(this);
        adapter=new SongsListAdapter(songs);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);

    }

}
