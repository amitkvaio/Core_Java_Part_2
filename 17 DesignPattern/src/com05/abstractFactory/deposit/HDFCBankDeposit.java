package com05.abstractFactory.deposit;

public class HDFCBankDeposit implements Deposit
{
		@Override
		public void depositMoney()
		{
			System.out.println("deposit Money at HDFC BANK");
		}
}
