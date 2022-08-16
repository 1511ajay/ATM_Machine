package com.miniProject;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmOperationImpl op = new AtmOperationImpl();
		
		int atmnumber=123;
		int atmpin=123;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome To ATM Machine !!! ");
		System.out.println("Enter ATM Number: ");
		int atmNumber=scanner.nextInt();
		System.out.println("Enter ATM Pin: ");
		int atmPin=scanner.nextInt();
		
		if(atmNumber==atmnumber&&atmPin==atmpin)
		{
			System.out.println("You have done succesfull validation: ");
			
			while(true)
			{
				System.out.println("1.Available Balance.\n2.Withdraw Amount.\n3.Diposit Amount.\n4.View Ministatement.\n5.Exit.");
				System.out.println("Enter Choice: ");
				int ch = scanner.nextInt();
				if(ch==1)//Available Balance
				{
					op.viewBalance();
				}
				else if(ch==2)//Withdraw Amount
				{
					System.out.println("Please Enter Withdrawn Amount: ");
					double withdraw=scanner.nextDouble();
					op.withdrawAmount(withdraw);
				}
				else if(ch==3)//Diposit Amount
				{
					System.out.println("Please Enter Diposit Amount: ");
					double diposite=scanner.nextDouble();
					op.dipositAmount(diposite);
				}
				else if(ch==4)//View Ministatement
				{
					op.ministatement();
				}
				else if(ch==5)//Exit.
				{
					System.out.println("Collect Your ATM.\nThankyou For Using ATM Machine");
					System.exit(0);
				}
				else
				{
					System.out.println("Please Enter Correct Choice: ");
				}
			}
		}
		else
		{
			System.out.println("Incorrect ATM Number & ATM Pin");
		}

	}

}
