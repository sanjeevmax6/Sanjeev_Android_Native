package android.example.rps_spider;

import android.app.Application;

import java.sql.Array;

public class GlobalClass extends Application {

    private String numberOfRounds;
    private String player1Name;
    private String player2Name;
    private String player1Choice;
    private String player2Choice;
    private int player1Score = 0;
    private int player2Score = 0;
    private String winner;
    int numRounds;
    private String singlePlayerName;
    private String singlePlayerChoice;
    private int singlePlayerScore = 0;
    private int botScore = 0;
    private boolean modeOfGame;
    private String botChoice;


    public GlobalClass() {
    }

    public void setNumRounds(int numRounds) {
        this.numRounds = numRounds;
    }

    public int getNumRounds() {
        return numRounds;
    }

    public void setNumberOfRounds(String numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    public String getNumberOfRounds() {
        return numberOfRounds;
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public void setPlayer2Name(String player2Name) {
        this.player2Name = player2Name;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public void setPlayer1Score(int player1Score) {

        this.player1Score = player1Score;

    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public void setPlayer2Score(int player2Score) {
        this.player2Score = player2Score;

    }
    public void setPlayer1Choice(String player1Choice ) {
        this.player1Choice = player1Choice;

    }

    public String getPlayer1Choice() {
        return player1Choice;
    }

    public void setPlayer2Choice(String player2Choice) {
        this.player2Choice = player2Choice;
    }

        public String getPlayer2Choice() {
        return player2Choice;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getWinner() {
        return winner;
    }

    public void setSinglePlayerName(String multiPlayerName) {
        this.singlePlayerName = multiPlayerName;
    }

    public String getSinglePlayerName() {
        return singlePlayerName;
    }

    public void setSinglePlayerChoice(String singlePlayerChoice) {
        this.singlePlayerChoice = singlePlayerChoice;
    }

    public String getSinglePlayerChoice() {
        return singlePlayerChoice;
    }

    public void setSinglePlayerScore(int singlePlayerScore) {
        this.singlePlayerScore = singlePlayerScore;
    }

    public int getSinglePlayerScore() {
        return singlePlayerScore;
    }

    public void setBotScore(int botScore) {
        this.botScore = botScore;
    }

    public int getBotScore() {
        return botScore;
    }

    public void setModeOfGame(boolean modeOfGame) {
        this.modeOfGame = modeOfGame;
    }
    public boolean getModeOfGame(){
        return modeOfGame;
    }

    public void setBotChoice(String botChoice) {
        this.botChoice = botChoice;
    }

    public String getBotChoice() {
        return botChoice;
    }
}
