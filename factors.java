package com.bridgelabz.corejava;

import java.util.Scanner;

public class factors {

	public static void main(String[] args) {

		int num, i;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number to compute factors:");

		num=sc.nextInt();
		sc.close();

		while (num%2==0)
		{
			System.out.println(2);
			num/=2;
		}

		for (i=3;i<=Math.sqrt(num);i+=2)
		{
			while(num%i == 0)
			{
				System.out.println(i);
				num/=i;
			}
		}

		if(num>2)
			System.out.println(num);

		sc.close();
	}
}


