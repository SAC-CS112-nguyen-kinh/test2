package test2Question2;

public class automobile {
	private static int year;
	private static String make = null;
	private static String model = null;
	private static int numberOfGear;
	private static String color = null;
	private static String name = null;
	private static int distance;
	
	
	
	public static void automobileAlt(int year, String make, String model, int numberOfGear, String color, String name)
	{
		year = year;
		make = make;
		model = model;
		numberOfGear = numberOfGear;
		color = color;
		name = name;
		
	}
	public static int Distance(int cycle)
	{
		
		if(cycle<= numberOfGear)
		{
			distance = (cycle * 10) / 60;
		}
		else if (cycle > numberOfGear)
		{
			distance = (numberOfGear * 10) / 60;
		}
		return distance;
	}
	
	}
	

