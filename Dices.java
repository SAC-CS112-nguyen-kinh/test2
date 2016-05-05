package test2;
import java.util.Scanner;

public class Dices {

	private int numberOfDice;
	Scanner input = new Scanner(System.in);
	
	public Dices()
	{
		this.numberOfDice = 2;
	}
	public int GetNumberOfDice()
	{
		System.out.print("how many dices do you wann throw? ");
		numberOfDice = input.nextInt();
		return numberOfDice;
	}
	
}
