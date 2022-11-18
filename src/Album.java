package src;


import java.util.ArrayList;
import java.util.Objects;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name=name;
        this.artist=artist;
        this.songs=new ArrayList<>();
    }

    //Find
    public boolean findSong(String title){
        for(Song checkSong: this.songs) {
            if (checkSong.getTitle().equals(title)){
                System.out.println("Song was found Succefully!!!");
                return true;
            }

        }
        System.out.println("Song not found!!!");
        return false;
    }

    // add Song
    public boolean addSongs(String title, double duration){
        if(findSong(title)==true){
            System.out.println("Song already Present!!!");
            return false;
        }
        //insert
        Song newSong=new Song(title,duration);
        this.songs.add(newSong);
        return true;
    }
    //if you know the song name then use this function
    public boolean addToPlaylist(String title, LinkedList<Song> playList){
        for(Song checkSong:this.songs){
            if(checkSong.getTitle().equals(title)){
                playList.add(checkSong);
                System.out.println("Add Song Succefully!!!");
                return true;
            }
        }
       return false;
    }

    //iff you don't know about song title then used album trackNumber
    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList){
        int idx=trackNumber-1;
        if(idx>=0 && idx<=this.songs.size()-1){
            playList.add(this.songs.get(idx));
            return true;
        }
        return false;
    }
}
