package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MusicTest {
    @Test
    public void selectionTest1(){

        String[] playlist = {"wheniseeyouagain","borntorun","nothingelsematters","cecelia"};
        Music music = new Music(playlist);
        Integer startingIndex = 1;
        String selection = "cecelia";
        Integer expected = 2;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest2(){

        String[] playlist = {"dancinginthedark","rio","liveoak","liveoak"};
        Music music = new Music(playlist);
        Integer startingIndex = 0;
        String selection = "liveoak";
        Integer expected = 1;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void moveUpAndStartOverTest(){
        String[] playist = {"BAP - Angel", "GOT7 - You Calling My Name", "EXO - Overdose",
                "Creepy Nuts - Hellraiser", "NCT Dream - Hot Sauce", "Aimer - Zankyosanka"};
        Music music = new Music(playist);
        Integer startingIndex = 1;
        String selection = "Creepy Nuts - Hellraiser";
        Integer expected = 2;
        Integer actual = music.moveUp(startingIndex,selection);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void moveDownAndGoToEndTest(){
        String[] playist = {"Monsta X - Love", "TEN - Birthday", "Moonbin and Sanha - Bad Idea",
                "LiSA - Gurenge", "Pink Lady - Monster", "Park Hyo Shin - Wild Flower"};
        Music music = new Music(playist);
        Integer startingIndex = 5;
        String selection = "TEN - Birthday";
        Integer expected = 4;
        Integer actual = music.moveDown(startingIndex,selection);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void goToStart(){
//        String[] playist = {"Monsta X - Love", "TEN - Birthday", "Moonbin and Sanha - Bad Idea",
//                "LiSA - Gurenge", "Pink Lady - Monster", "Park Hyo Shin - Wild Flower"};
//        Music music = new Music(playist);
//        Integer startingIndex = playist.length;
//        String selection = "Monsta X - Love";
//        String expected = "Monsta X - Love";
//        String actual = music.goToStart(startingIndex,selection);
//        Assert.assertEquals(expected, actual);
    }
}