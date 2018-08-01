package Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.omarsalama.soundcloudlist.R;
import com.example.omarsalama.soundcloudlist.Song;

import java.util.ArrayList;

public class SongsListAdapter extends RecyclerView.Adapter<SongsListAdapter.ViewHolder> {
    ArrayList<Song> songs;

    public SongsListAdapter(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.song_item, parent, false);
        ViewHolder vh=new ViewHolder(v) ;
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Song s=songs.get(position);
        holder.username.setText(s.getUsername());
        holder.songname.setText(s.getArtistname());
        holder.songimg.setImageDrawable(s.getSongimg());
        holder.plays.setText(s.getNumOfPlays());
        holder.moresettings.setImageResource(R.drawable.ic_more_vert_black_24dp);
        holder.songlength.setText(s.getSonglength());
    }

    @Override
    public int getItemCount() {

        return songs.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView username;
        TextView songname;
        TextView songlength;
        ImageView songimg;
        ImageView moresettings;
        TextView plays;

        public ViewHolder(View v){
            super(v);
            username=v.findViewById(R.id.username);
            songname=v.findViewById(R.id.songname);
            songlength=v.findViewById(R.id.songlength);
            songimg=v.findViewById(R.id.songimg);
            moresettings=v.findViewById(R.id.settings);
            plays=v.findViewById(R.id.plays);
        }

    }
}
