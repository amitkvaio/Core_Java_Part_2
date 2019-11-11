package com05.abstractFactory;

import com05.abstractFactory.bank.Bank;
import com05.abstractFactory.bank.CanaraBank;
import com05.abstractFactory.bank.CitiBank;
import com05.abstractFactory.bank.DenaBank;
import com05.abstractFactory.bank.HDFCBank;
import com05.abstractFactory.deposit.Deposit;

public class BankFactory extends AbstractFactory
{

	@Override
	public Bank getBank(String bank)
	{
		if(bank==null)
		{
			return null;
		}
		else if ("CanaraBank".equalsIgnoreCase(bank))
		{	
			return new CanaraBank();
		}
		else if ("CitiBank".equalsIgnoreCase(bank))
		{	
			return new CitiBank();
		}
		else if ("DenaBank".equalsIgnoreCase(bank))
		{	
			return new DenaBank();
		}
		else if ("HDFCBank".equalsIgnoreCase(bank))
		{	
			return new HDFCBank();
		}
		return null;
	}
	@Override
	public Deposit depositMoney(String deposit)
	{
		return null;
	}
}
