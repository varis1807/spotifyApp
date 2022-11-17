package src;


import java.util.ArrayList;
import java.util.Objects;

public class Album {
    String name;
    String artist;
    ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name=name;
        this.artist=artist;
        this.songs=new ArrayList<>();
    }

    //Find
    public boolean findSong(String title){
        for(Song checkSong:this.songs) {
            if (checkSong.getTitle()){
                System.out.println("Song was found Succefully!!!");
                return true;
            }

        }
            return false;
    }
}
