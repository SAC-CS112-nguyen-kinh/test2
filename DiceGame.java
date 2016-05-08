package test2Question1;

import java.util.Random;
public class DiceGame  
{ 
        private static int dice;  
        private static int lowBound = 1; 
        private static int highBound = 6; 
     
   
	public static int ThrowDice(int dices) 
	{ 
            dice = dices; 
            lowBound = lowBound * dice; 
            highBound = highBound * dice; 
            Random rand = new Random(); 
            int diceValue = lowBound+(int)(Math.random() * ((highBound-lowBound) + 1)); 
            return diceValue; 
	} 
} 

