package test2Question1;

import java.util.Scanner; 
 public class Test2  
 { 
 
 
      
     public static void main(String[] args)  
     { 
         int numberOfDice; 
          
          
         Scanner scan = new Scanner(System.in);           
         
		System.out.println("how many dice do you want to throw? "); 
         numberOfDice = scan.nextInt(); 
          
         System.out.println("dice rolled: " + DiceGame.ThrowDice(numberOfDice)); 
     } 
      
 } 
