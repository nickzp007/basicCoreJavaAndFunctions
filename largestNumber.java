package com.bridgelabz.corejava;

import java.util.Scanner;

public class largestNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers to find out largest one");
		
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		int largest;
		sc.close();
		
		largest = 0;
		if (first > second && first > third)
			largest = first;
		
		else if (second > first && second > third)
			largest = second;
		
		else
			largest = third;
		System.out.println("Largest one Among three : " + largest);
	}


}
