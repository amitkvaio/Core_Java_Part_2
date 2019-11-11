package com.test;

import com05.abstractFactory.AbstractFactory;
import com05.abstractFactory.BankFactory;
import com05.abstractFactory.DepositFactory;

public class FactoryProvider01 {
	public static AbstractFactory getFactory (String name) {
		if(name==null) {
			return null;
		}else if("Bank".equals(name)) {
			return new BankFactory();
		}else if("Deposite".equals(name)) {
			return new DepositFactory();
		}else {
			return null;
		}
	}
}
