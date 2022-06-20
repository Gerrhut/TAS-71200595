// Nama : Gerry Sunjay Junjung
// NIM  : 71200595

package com.rplbo.musicplaylist;

public class Song {
    private String artist;
    private String album;
    private String name;
    private int length;

    public Song (String artist, String album, String name, int length){
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.length = length;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public void setLength(int length){
        this.length = length;
    }

    public String getArtist() {
        return artist;
    }

    public void setName(String name){

    }

    public String getAlbum(){
        return album;
    }

    public String getName(){
        return name;
    }

    public int getLength(){
        return length;
    }
}
