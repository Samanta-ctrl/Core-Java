package Basics;

import java.util.Scanner;

public class Fahrenheit_to_Celsius_Conversion 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Fahrenheit temperature value: ");
		double far=scn.nextDouble();
		scn.close();
		
		float cel=(float)((far-32) *5) /9;
		System.err.println("After converting the respective Celsius value is : "+cel);
		
	}
}

//Formula: Celsius=((Fahrenheit-32)*5)/9;