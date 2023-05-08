package day18;

import java.util.Scanner;

public abstract class Bike 
{
protected int speed=90;
Scanner sc=new Scanner(System.in);
public Bike() 
{
	super();
	this.speed = speed;
	System.out.println("speed of bike :"+speed);
}
static void getdetails()
{
	System.out.println("color of bike is red");
	System.out.println("milage of bike is 70khl");	
}
 abstract void run();
{
	
}


	
}
