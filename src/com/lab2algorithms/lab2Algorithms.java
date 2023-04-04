package com.lab2algorithms;

import java.util.Scanner;

class Transaction {
	public static void main(String args[]) {
		
				
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int noOfTransactions = s.nextInt();

		int transactionAmounts[] = new int[noOfTransactions];
		System.out.println("Enter values of array");
		
		for (int index = 0; index < transactionAmounts.length; index++) 
			{
			transactionAmounts[index] = s.nextInt();
			}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noOfTargets = s.nextInt();
		int targetAmount[]=new int[noOfTargets];
		
		for (int i=0;i<targetAmount.length; i++) {
			System.out.println("Enter the value of target");
			int amount = s.nextInt();
			long sum = 0;
			int flag=0;
			for (int target = 0; target < transactionAmounts.length; target++) {
				sum += transactionAmounts[target];
				
				
				if (sum >= amount) {
					System.out.println("Target Achieved after " + (target + 1) + " transactions");
					flag = 1;
					break;

				}
			}
			if (flag == 0)
			{
				System.out.println("Given target is not achieved");

			}
				
		}
		s.close();
	}
	
}
