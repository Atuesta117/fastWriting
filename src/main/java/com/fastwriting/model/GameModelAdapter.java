package com.fastwriting.model;

/**
 * An adapter class that provides a default, empty implementation of the {@link IGameInterface}.
 * Subclasses can extend this class and override only the specific methods they need to implement,
 * which simplifies the creation of new game models.
 */
public class GameModelAdapter implements IGameInterface {

    /**
     * Checks if the user's input matches a phrase from the current level.
     * @param input The text entered by the user.
     * @return true if the input is a correct phrase, false otherwise.
     */
    @Override
    public boolean isInputIsCorrect(String input) {
        return false;
    }

    /**
     * Starts the game session.
     */
    @Override
    public void startGame() {
        // There is no implementation for defect
    }

    /**
     * Advances the game to the next level.
     */
    @Override
    public void levelUp() {
        // There is no implementation for defect
    }

    /**
     * Sets the playing status of the game.
     * @param isPlaying A boolean value to set the game's playing state.
     */
    @Override
    public void setIsPlaying(boolean isPlaying) {
        //There is no implementation for defect
    }

    /**
     * Gets the current level of the game.
     * @return The current level as an integer.
     */
    @Override
    public int getLevel() {
        return 0;
    }

    /**
     * Gets the total time in seconds for the current level.
     * @return The time limit as an integer.
     */
    @Override
    public int getTime() {
        return 0;
    }

    /**
     * Increments the failure count by one.
     */
    @Override
    public void countFailures() {
        //There is no implementation for defect
        }

    /**
     * Sets the remaining time for the current level.
     * @param time The remaining time in seconds.
     */
    @Override
    public void setRemainingTime(int time) {
        //There is no implementation for defect
    }

    /**
     * Gets the total number of typing failures.
     * @return The number of failures as an integer.
     */
    @Override
    public int getFailures() {
        return 0;
    }

    /**
     * Gets the total number of successful phrases typed.
     * @return The number of successes as an integer.
     */
    @Override
    public int getSuccess() {
        return 0;
    }

    /**
     * Gets the remaining time at the end of the game session.
     * @return The remaining time in seconds.
     */
    @Override
    public int getRemainingTime() {
        return 0;
    }

    /**
     * Checks if the player has won the game.
     * @return true if the player has won, false otherwise.
     */
    @Override
    public boolean getPlayerIsWin() {
        return false;
    }


}