package org.kata.yahtzeegame;

import java.util.Scanner;

public class Game
{
    private Scanner scan = new Scanner( System.in );
    private int s1, s2, s3, s4, s5;
    private int repition = 1;
    private Dice dice = new Dice();
    private ScoreCalculator calculator = new ScoreCalculator();
 
    //method to start a new game
    public void beginGame(){
    	
    	System.out.println("Please enter the number corresponding to your selection\n "
				+ "1. Ones \n 2. Twos 3. Threes \n 4. Fours \n 5. Fives \n 6. Sixes \n "
				+ "7. Pairs \n 8. Two pairs \n 9. Three of a Kind \n 10. Four of a Kind \n "
				+ "11. Small Straight \n 12. Large Straight \n 13. Full house \n 14. Yahtzee"
				+ "\n 15. Chance");
		BetSelectedEnum selectedOption = BetSelectedEnum.valueOf(scan.nextInt());
        System.out.println("Select which dice to re-roll.");
        dice.showValues(dice.initialRoll());
        while ( repition < 3 ){
            playerInput();
            dice.showValues(dice.diceValues());
            }
        System.out.println("Points Won " + calculator.calculatePoints(selectedOption, dice.diceValues()));
    }
 
    //method to take players input for which dice to re-roll
    public void playerInput(){
        s1 = scan.nextInt();
        s2 = scan.nextInt();
        s3 = scan.nextInt();
        s4 = scan.nextInt();
        s5 = scan.nextInt();
        playerReroll(dice.diceValues());
    }
 
    //method to determine which dice to re-roll
    public int[] playerReroll( int[] dices ){
        if ( s1 == 1 ){
            dices[0] = dice.rollTheDice(); //re-roll Die 1
        }
        if ( s2 == 1 ){
            dices[1] = dice.rollTheDice(); //re-roll Die 2
        }
        if ( s3 == 1 ){
            dices[2] = dice.rollTheDice(); //re-roll Die 3
        }
        if ( s4 == 1 ){
            dices[3] = dice.rollTheDice(); //re-roll Die 4
        }
        if ( s5 == 1 ){
            dices[4] = dice.rollTheDice(); //re-roll Die 5
        }
        repition++;
        return dices;
    }
}