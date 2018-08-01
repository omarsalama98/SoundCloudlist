package com.example.omarsalama.soundcloudlist;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Song {
    String artistname;
    String username;
    String songlength;
    Drawable songimg;
    String numOfPlays;

    public Song(String artistname, String username, String songlength, Drawable songimg, String numOfPlays) {
        this.artistname = artistname;
        this.username = username;
        this.songlength = songlength;
        this.songimg = songimg;
        this.numOfPlays = numOfPlays;
    }

    public String getArtistname() {
        return artistname;
    }

    public void setArtistname(String artistname) {
        this.artistname = artistname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSonglength() {
        return songlength;
    }

    public void setSonglength(String songlength) {
        this.songlength = songlength;
    }

    public Drawable getSongimg() {
        return songimg;
    }

    public void setSongimg(Drawable songimg) {
        this.songimg = songimg;
    }

    public String getNumOfPlays() {
        return numOfPlays;
    }

    public void setNumOfPlays(String numOfPlays) {
        this.numOfPlays = numOfPlays;
    }
}
