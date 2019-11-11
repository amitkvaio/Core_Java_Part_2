package com05.abstractFactory;

import com05.abstractFactory.bank.Bank;
import com05.abstractFactory.deposit.CanaraBankDepoist;
import com05.abstractFactory.deposit.CityBankDeposit;
import com05.abstractFactory.deposit.DenaBankDeposit;
import com05.abstractFactory.deposit.Deposit;
import com05.abstractFactory.deposit.HDFCBankDeposit;

public class DepositFactory extends  AbstractFactory
{
	@Override
	public Deposit depositMoney(String deposit)
	{
		if(deposit==null)
		{
			return null;
		}
		else if ("CanaraBankDepoist".equalsIgnoreCase(deposit))
		{
			return new CanaraBankDepoist();
		}
		else if ("CityBankDeposit".equalsIgnoreCase(deposit))
		{
			return new CityBankDeposit();
		}
		else if ("DenaBankDeposit".equalsIgnoreCase(deposit))
		{
			return new DenaBankDeposit();
		}
		else if ("HDFCBankDeposit".equalsIgnoreCase(deposit))
		{
			return new HDFCBankDeposit();
		}
		return null;
	}
	 
	@Override
	public Bank getBank(String bank)
	{
		return null;
	}
}
