package com.bridgelabz.corejava;

import java.util.Scanner;

public class swapnumber {

	public static void main(String[] args) {
		
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Number ");
		a =sc.nextInt();
		System.out.print("Enter Second Number ");
		b =sc.nextInt();
		sc.close();
		a=a+b; 
		b=a-b;
		a=a-b;

		System.out.println("After Swaping Two numbers ");

		System.out.println("First Number: "+a);
		System.out.println("Second Number : " +b);


	}

}
