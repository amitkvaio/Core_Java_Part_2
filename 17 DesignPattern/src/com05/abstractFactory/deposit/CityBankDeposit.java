package com05.abstractFactory.deposit;

public class CityBankDeposit implements Deposit
{
	@Override
	public void depositMoney()
	{
		 System.out.println("deposit money at City Bank");
	}
}
