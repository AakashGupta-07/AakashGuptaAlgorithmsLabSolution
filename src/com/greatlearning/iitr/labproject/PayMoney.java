package com.greatlearning.iitr.labproject;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the no of transactions-");
		
		int noOFTransactions = sc.nextInt();
		
		int arr[] = new int[noOFTransactions];
		
		System.out.println("Enter the transactions values--");
		
		for(int i = 0; i < arr.length ; i++) {
			
		arr[i] = sc.nextInt();
			
		}
		
		System.out.println("Enter the no of targets to be achieved--");
		
		int noOFTargets = sc.nextInt();
		
		while( noOFTargets-- !=0);
		
		System.out.println("Enter Value Of Target--");
		
		long targetValue = sc.nextInt();
		 
		boolean isTargetAchieved = false;
		
		long sum=0;
		 
		for(int i=0; i<arr.length; i++) {
		
			sum=sum+arr[i];
		
			if(sum>=targetValue) {
				
				System.out.println("target is achieved at "+ (i+1));
				
				isTargetAchieved= true;
				break;	
			}	
			
		}
		if(isTargetAchieved==false) {
			
			System.out.println("Your Target can not be Achieved");
			
		}
						
	}

}
