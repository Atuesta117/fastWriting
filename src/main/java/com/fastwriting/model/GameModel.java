package com.fastwriting.model;

/**
 * The model class representing the state of the typing game.
 * It manages game logic such as the current level, time, player's score, and game status.
 */
public class GameModel {
    private int level;
    private int time;
    private boolean isPlaying;
    private Phrases phrases = new Phrases();
    private int failures;
    private int success;
    private int remainingTime;
    private boolean playerIsWin;

    /**
     * Constructs a new {@code GameModel} and initializes the game state.
     * Sets the initial level, starts the game, and resets scores and timers.
     */
    public GameModel() {
        this.level = 1;
        this.isPlaying = false;
        this.phrases = new Phrases();
        isPlaying = true;
        time = 20;
        this.failures = 0;
        this.success = 0;
        this.remainingTime = 0;
        playerIsWin = false;
    }

    /**
     * Checks if the user's input matches a phrase from the current level.
     *
     * @param input The text entered by the user.
     * @return {@code true} if the input is a correct phrase for the current level, {@code false} otherwise.
     */
    public boolean isInputIsCorrect(String input) {
        return phrases.getLevelList(level).contains(input);
    }

    /**
     * Starts the game session by setting the game status to playing.
     */
    public void startGame() {
        isPlaying = true;
    }

    /**
     * Advances the game to the next level.
     * It increments the level and the success count. Every 5 levels, it decreases the available time by 2 seconds.
     */
    public void levelUp() {
        level++;
        success++;
        if (level % 5 == 0 && time != 2) {
            time = time - 2;
        }
    }

    /**
     * Gets the current playing status of the game.
     *
     * @return {@code true} if the game is currently running, {@code false} otherwise.
     */
    public boolean getIsPlaying() {
        return isPlaying;
    }

    /**
     * Sets the playing status of the game.
     *
     * @param isPlaying A boolean value to set the game's playing state.
     */
    public void setIsPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    /**
     * Gets the current level of the game.
     *
     * @return The current level as an integer.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Gets the total time in seconds for the current level.
     *
     * @return The time limit as an integer.
     */
    public int getTime() {
        return time;
    }

    /**
     * Increments the failure count by one.
     */
    public void countFailures() {
        failures++;
    }

    /**
     * Sets the remaining time for the current level.
     *
     * @param time The remaining time in seconds.
     */
    public void setRemainingTime(int time) {
        this.remainingTime = time;
    }

    /**
     * Gets the total number of typing failures.
     *
     * @return The number of failures as an integer.
     */
    public int getFailures() {
        return failures;
    }

    /**
     * Gets the total number of successful phrases typed.
     *
     * @return The number of successes as an integer.
     */
    public int getSuccess() {
        return success;
    }

    /**
     * Gets the remaining time at the end of the game session.
     *
     * @return The remaining time in seconds.
     */
    public int getRemainingTime() {
        return remainingTime;
    }

    /**
     * Checks if the player has won the game. The player wins when they reach a level greater than 41.
     *
     * @return {@code true} if the player has won, {@code false} otherwise.
     */
    public boolean getPlayerIsWin() {
        if (level > 41) {
            playerIsWin = true;
        }
        return playerIsWin;
    }
}