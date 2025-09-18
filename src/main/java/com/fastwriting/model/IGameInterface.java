package com.fastwriting.model;

import java.util.List;

/**
 * An interface for the game model, defining the contract for game state management.
 * This allows for decoupling the game logic from its concrete implementation.
 */
public  interface IGameInterface {

    /**
     * Checks if the user's input matches a phrase from the current level.
     * @param input The text entered by the user.
     * @return true if the input is a correct phrase, false otherwise.
     */
    boolean isInputIsCorrect(String input);

    /**
     * Starts the game session.
     */
    void startGame();

    /**
     * Advances the game to the next level.
     */
    void levelUp();

    /**
     * Gets the current playing status of the game.
     * @return true if the game is running, false otherwise.
     */
    boolean getIsPlaying();

    /**
     * Sets the playing status of the game.
     * @param isPlaying A boolean value to set the game's playing state.
     */
    void setIsPlaying(boolean isPlaying);

    /**
     * Gets the current level of the game.
     * @return The current level as an integer.
     */
    int getLevel();

    /**
     * Gets the total time in seconds for the current level.
     * @return The time limit as an integer.
     */
    int getTime();

    /**
     * Increments the failure count by one.
     */
    void countFailures();

    /**
     * Sets the remaining time for the current level.
     * @param time The remaining time in seconds.
     */
    void setRemainingTime(int time);

    /**
     * Gets the total number of typing failures.
     * @return The number of failures as an integer.
     */
    int getFailures();

    /**
     * Gets the total number of successful phrases typed.
     * @return The number of successes as an integer.
     */
    int getSuccess();

    /**
     * Gets the remaining time at the end of the game session.
     * @return The remaining time in seconds.
     */
    int getRemainingTime();

    /**
     * Checks if the player has won the game.
     * @return true if the player has won, false otherwise.
     */
    boolean getPlayerIsWin();
}
