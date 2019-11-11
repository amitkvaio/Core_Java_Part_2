package com05.abstractFactory.deposit;

public class CanaraBankDepoist implements Deposit
{
	@Override
	public void depositMoney()
	{
		System.out.println("depositMoney at Canara Bank");
	}
}
