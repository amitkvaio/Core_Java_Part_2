package com05.abstractFactory;

import com05.abstractFactory.bank.Bank;
import com05.abstractFactory.deposit.Deposit;

public abstract class  AbstractFactory
{
	 abstract Bank	 getBank(String bank);
	 abstract Deposit depositMoney(String deposit) ;
}
