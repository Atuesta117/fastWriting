package com.fastwriting.model;

public class GameModel {
    private int level ;
    private int time;
    private boolean isPlaying;
    private Phrases phrases = new Phrases();

    public GameModel() {
        this.level = 1;
        this.isPlaying = false;
        this.phrases = new Phrases();
    }
    public boolean isInputIsCorrect(String input) {
        return phrases.getLevelList(level).contains(input);

    }
    public void startGame(){
        isPlaying = true;
        time = 20;
    }
    public void levelUp() {
        level++;
        if(level%5==0){
            time = time - 2;
        }
    }
    public boolean getIsPlaying() {
        return isPlaying;
    }
    public int getLevel() {return level;}


}
