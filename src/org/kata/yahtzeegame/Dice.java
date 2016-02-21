package org.kata.yahtzeegame;

import java.util.Random;
public class Dice
{
    private Random random = new Random();
    private int[] dice = new int[5];
    public int turn;
 
    //method to roll a single die
    public int rollTheDice()
    {
        int diceValue = 1 + random.nextInt(6);
        return diceValue;
    }
 
    //method to create an array containing the 5 rolled dice
    public int[] initialRoll(){
        for (int a=0; a<dice.length; a++){
            dice[a]= rollTheDice();
        }
        return dice;
    }
 
    //method to hold the 5 dice
    public int[] diceValues(){
        return dice;
    }
 
    //method to display the array containing the dice
    public void showValues( int[] dice ){
        for (int a=0; a<dice.length; a++){
            System.out.print(dice[a] + " ");
        }
    }
}