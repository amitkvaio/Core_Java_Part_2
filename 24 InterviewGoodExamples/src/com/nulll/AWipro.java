package com.nulll;

import java.util.ArrayList;
import java.util.List;

abstract class Company{

}
class Wipro extends Company{
	
}
class TCS extends Company{
	
}
class IBM extends Company{
	
}
class INFOSYS extends Company{
	
}

public class AWipro {
	public static void main(String[] args) {
		List<Company> listCompanies = new ArrayList<Company>();
		listCompanies.add(new Wipro());
		listCompanies.add(new TCS());
		listCompanies.add(new IBM());
		listCompanies.add(new INFOSYS());
		
		for (Company company : listCompanies) {
			System.out.println(company.getClass().getName());
		}
		System.out.println("Done");
	}
}
