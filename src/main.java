package src;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class main {
    public static void main(String [] args){
        Album a1=new Album("al1", "alan walker");
       a1.addSongs("Song1",4.5);
        a1.addSongs("Song2",3.5);
        a1.addSongs("Song3",2.5);
        a1.addSongs("Song4",1.5);
        a1.addSongs("Song5",4.8);
        a1.addSongs("Song6",4.88);

        LinkedList<Song> playList=new LinkedList<>();
        a1.addToPlaylist("Alone",playList);
        a1.addToPlaylist("Darkside",playList);
        printList(playList);

        play(playList);
    }
    public static void printList(LinkedList<Song> playList){
        ListIterator<Song> itr=playList.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    //menu function
    public static void printMenu(){
        System.out.println("0. Exit");
        System.out.println("1. Print Menu");
        System.out.println("2. Show The List Of All Song");
        System.out.println("3. Play Next Song");
        System.out.println("4. Play Previous Song");
        System.out.println("5. Repeat The Song");
        System.out.println("6. Delete The Song");
    }

    // make play function for play songs

    public static void play(LinkedList<Song> playList){
        Scanner scn=new Scanner(System.in);
        ListIterator<Song> itr = playList.listIterator();
        if(!itr.hasNext()){
            System.out.println("PlayList is Empty");
            return;
        }
        System.out.println("You are now listening "+itr.next());
        printMenu();
        boolean forward=true;

        while(true){
            int option=scn.nextInt();

            switch (option){
                case 0:
                    System.out.println("Thank You For listening");
                    return;
                case 1:
                    printMenu();
                    break;
                case 2:
                    printList(playList);
                    break;
                case 3:
                    if(!forward)
                    {
                        if(itr.hasNext())
                        itr.next();
                    }
                    if(!itr.hasNext()){
                        System.out.println("You have reached the end of playlist");
                    }
                    else {
                        System.out.println("You are listening is " + itr.next());
                    }
                case 4:
                    if(forward)
                    {
                        if(itr.hasPrevious()) {
                            itr.previous();
                        }
                    }
                    if (!itr.hasNext())
                    {
                        System.out.println("You have reached the start of playlist");
                    }
                    else
                    {
                        System.out.println("You are listening to "+itr.previous());
                    }
                    forward=false;
                    break;
            }
        }
    }
}
