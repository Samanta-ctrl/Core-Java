package Basics;

import java.util.Scanner;

public class Celsius_to_Fhrenheit_Conversion 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Celsius temperature value: ");
		double cel=scn.nextDouble();
		scn.close();
		
		float far=(float)((cel*9)/5)+32;
		System.err.println("After converting the respective Celsius value is : "+far);
	}
}

//Formula: Fahrenheit=((Celsius*9)/5)+32;