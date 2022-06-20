// Nama : Gerry Sunjay Junjung
// NIM  : 71200595

package com.rplbo.musicplaylist;

import java.util.ArrayList;

public class Playlist {
    private String playlistName;
    private ArrayList<Song> Song = new ArrayList<Song>(6);
    private int count;

    public Playlist() {
        ArrayList<Song> Song = new ArrayList<Song>(6);
    }


    public String getPlaylistName(){
        return playlistName;
    }

    public void print(){
        System.out.println("Jumlah Lagu : "+this.Song.size()+" / Kapasitas Playlist = "+size());
        for (int i = 0;
             i<Song.size();
             i++){
            System.out.println("ListSong["+i+"]: "+Song.get(i).getName()+" - "+Song.get(i).getArtist());
        }
    }

    public void setPlaylistName(String playlistName){
        this.playlistName = playlistName;
    }

    public String totalTime(){
        int total = 0;
        for (int i = 0 ;
             i < Song.size();
             i++){
            total += Song.get(i).getLength();
        } return ("Total waktu ["+this.playlistName+"]="+total);
    }

    public void add(Song song){
        if(this.count<=5){
            this.count++;
            Song.add(song);
        }else{
            System.out.println("Playlist"+this.getPlaylistName()+"Penuh!. Tidak bisa menambah lagu lagi ");
        }
    }

    public Song remove(String song){
        for(int i = 0;
            i<Song.size();
            i++){
            if (Song.get(i).getName().equals(song)){
                Song.remove(i);
                System.out.println(song+"Terhapus...");
            }
        }return null;
    }

    public int size(){
        return this.count;
    }
}