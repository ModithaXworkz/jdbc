package com.xworkz.sample.statement.icecream;

import com.xworkz.sample.statement.icecream.*;


public class IcecreamNovitiator {	
	public static void main(String[] args) {
		
IcecreamDTO icecream=new IcecreamDTO(3,"Mango","Cup",25);
	
	IcecreamDAO dao=new IcecreamDAO();
	boolean save=dao.saveDTO(icecream);
	//System.out.println(save);
	//dao.deleteById(1);
	dao.displayById(2);
	dao.displayAll();
	dao.displayTotalNoOfRecords();
			
}
}