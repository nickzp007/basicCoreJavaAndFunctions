package com.bridgelabz.corejava;

import java.util.*;
public class powerOfTwo {

	public static void main(String[] args) {
		int N, powerOfTwo, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Power Value Between 0 to 31: ");
		N = sc.nextInt();
		sc.close();

		for (i = 1; i <= N; i++) {
			powerOfTwo = (int) Math.pow(2, i);
			System.out.println(powerOfTwo + " ");
		}
	}
}
