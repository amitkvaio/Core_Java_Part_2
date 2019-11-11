package com05.abstractFactory;

import com05.abstractFactory.bank.Bank;
import com05.abstractFactory.deposit.Deposit;

public class Manager01
{
	public static void main(String[] args)
	{
		AbstractFactory bankFactory = FactoryProvider.getFactory("BANK");
		AbstractFactory deposit = FactoryProvider.getFactory("Deposit");
		
		Bank canaraBank = bankFactory.getBank("CanaraBank");
		canaraBank.go();
		
		Bank citiBank = bankFactory.getBank("CitiBank");
		citiBank.go();
		
		Bank denaBank = bankFactory.getBank("DenaBank");
		denaBank.go();
		
		Bank hdfcBank = bankFactory.getBank("HDFCBank");
		hdfcBank.go();
		System.out.println("***************************");
		Deposit dep = deposit.depositMoney("CanaraBankDepoist");
		dep.depositMoney();
	}
}
