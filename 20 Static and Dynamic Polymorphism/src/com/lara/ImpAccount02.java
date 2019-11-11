package com.lara;

public class ImpAccount02
{
	public static void main(String[] args)
	{
		Decide d1 = new Decide();
		d1.withdrowMyAccount(new CurrentAccount());
		d1.withdrowMyAccount(new BSavingAccount());
		d1.withdrowMyAccount(new DFixedDeposit());
		
		/*
			Here we are free to pass the Account type it may be CA or SA or DFA based 
			on type of Account it will call the withdrow() method.
			
			in Decide class we are calling withdrowMyAccount(---) method and inside it, it decide which Account
			type withdrow() should be called it may be CA or SA 
		*/
	}
}