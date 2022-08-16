package com.miniProject;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf {

	ATM atm = new ATM();
	Map<Double,String> ministmt = new HashMap<>();
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Availabe Balance is: "+atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		// TODO Auto-generated method stub
		if(withdrawAmount%500==0)
		{
		if(withdrawAmount<=atm.getBalance())
		{
			ministmt.put(withdrawAmount	, "Amount Withdrawn");
		System.out.println("Collect The Cash: !!"+withdrawAmount);
		atm.setBalance(atm.getBalance()-withdrawAmount);
		viewBalance();
		}
		else
		{
			System.out.println("Insufficient Fund In Your Account");
		}
		}
		else
		{
			System.out.println("Please Enter Amount In Multiple of 500");
		}
		
	}

	@Override
	public void dipositAmount(double diposite) {
		// TODO Auto-generated method stub
		ministmt.put(diposite, "Amount Diposited");
		System.out.println("Diposit Amount Diposited Successfuly: !!");
		atm.setBalance(atm.getBalance()+diposite);
		viewBalance();
	}

	@Override
	public void ministatement() {
		// TODO Auto-generated method stub
		for(Map.Entry<Double, String>m:ministmt.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
			System.out.print(" Available Balance: "+atm.getBalance());
		}
		
	}

}
