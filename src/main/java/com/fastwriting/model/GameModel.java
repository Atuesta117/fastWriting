package com.fastwriting.model;

public class GameModel {
    private int level ;
    private int time;
    private boolean isPlaying;
    private Phrases phrases = new Phrases();
    private int failures ;
    private int success;
    private int remainingTime;
    private boolean playerIsWin;
    public GameModel() {
        this.level = 1;
        this.isPlaying = false;
        this.phrases = new Phrases();
        isPlaying = false;
        time = 20;
        this.failures = 0;
        this.success = 0;
        this.remainingTime = 0;
        playerIsWin = false;
    }
    public boolean isInputIsCorrect(String input) {
        return phrases.getLevelList(level).contains(input);

    }
    public void startGame(){
        isPlaying = true;
    }
    public void levelUp() {
        level++;
        success++;
        if(level%5==0){
            time = time - 2;

        }


    }
    public boolean getIsPlaying() {
        return isPlaying;
    }
    public int getLevel() {return level;}
    public int getTime() {return time;}



    public boolean isGameOver(){
        isPlaying = false;
        return isPlaying;
    }
    public void countFailures(){
        failures++;
    }

    public void setRemainingTime(int time) {
        this.remainingTime = time;
    }
 public int  getFailures() {
        return failures;
    }
    public int getSuccess() {
        return success;
    }
    public int getRemainingTime() {
        return remainingTime;
    }

    public boolean getPlayerIsWin() {
        if(level >21){
            playerIsWin = true;
        }
        return playerIsWin;}
}


