package com.bridgelabz.functional;

import java.util.*;

public class distance {

	static double distance(int x1, int y1, int x2, int y2)
	{
		return Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
	}
	
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of X");
		int x2=sc.nextInt();
		System.out.println("Enter value of Y");
		int y2=sc.nextInt();
		System.out.println(distance(0,0,x2,y2));
	}
}


