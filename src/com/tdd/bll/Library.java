/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdd.bll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Library {
   
    List<Song> songs;
    List<Playlist> Playlist;
        
    public Library(){
        songs = new ArrayList<Song>();
        Playlist = new ArrayList<Playlist>();
    }
    
   public void addSong(Song songToAdd){
       songs.add(songToAdd);
   }
   
    public int songCount(){
        return songs.size();
    }

    public void SongsLeft(){
        //System.out.print(songs.iterator().next());
        Iterator<Song> iterator = songs.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next().toString());
	}
    }
    
    public void removeSong(int songsNumber) {
        songs.remove(songsNumber);
    }
    
   // public void removeSong(String song, String artist) {
    //    songs.remove(song, artist);
  //  }
    
    public void addPlaylist(Playlist addPlaylist){
       Playlist.add(addPlaylist);
    }
    
    public int playlistCount(){
        return Playlist.size();
    }
    
    
}
