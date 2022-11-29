package io.zipcoder;

import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class Music {
    private String[] playList;
    String si; //this is the currently playing song title
    String q; //this is the song you want to go to...
    int n; //the index of the song that you want to play
    public Music(String[] playList){
        this.playList = playList;
    }


    //this seems easy... just return the number that it
    // takes to get from one part of the index to another
    public Integer selection(Integer startIndex, String selection){
        ArrayList<String> playList1 = new ArrayList<String>(Arrays.asList(playList));
        Integer results = 0;
        for (int i = startIndex; i < playList1.size(); i++) {
            System.out.println("Current song title: " + playList1.get(i));
            if (playList1.get(i).equals(selection)) {
                System.out.println("Song to select: " + playList1.get(i));
            }
            if(playList1.indexOf(selection) < startIndex){
                results = moveDown(startIndex, selection);
            } else if(playList1.indexOf(selection) > startIndex){
                results = moveUp(startIndex,selection);
            }
        }

        return results;
    }

    public Integer moveUp(Integer startIndex, String selection) {
        ArrayList<String> playList1 = new ArrayList<String>(Arrays.asList(playList));
        Integer numOfMoves = 0;
        for (int i = startIndex; i < playList1.size(); i++) {
            System.out.println(playList1.get(i));
            numOfMoves++;
            if (playList1.get(i).equals(selection)) {
                System.out.println("Now playing: " + playList[i]);
                break;
            }

        }  return numOfMoves -1;
    }

    public Integer moveDown(Integer startIndex, String selection) {
        ArrayList<String> playList1 = new ArrayList<String>(Arrays.asList(playList));
        Integer numOfMoves = 0;
        for (int i = startIndex; i < playList1.size(); i--) {
            System.out.println(playList1.get(i));
            numOfMoves++;
                if (playList1.get(i).equals(selection)) {
                    System.out.println("Now playing: " + playList[i]);
                    break;
                }
        } return numOfMoves - 1;
    }

}
