package com.xworkz.icecream;

import java.util.Iterator;

public class IcecreamNovitiator {
public static void main(String[] args) {
	IcecreamDTO dto[]= new IcecreamDTO[5];
	dto[0]= new IcecreamDTO(31,"ferreroroaster","chocalate",90);
	dto[1]=new IcecreamDTO(32,"darkfantacy","darkchocalate",70);
	dto[2]=new IcecreamDTO(33,"ferry","strawberry",120);
	dto[3]=new IcecreamDTO(34,"pista","nut",150);
	dto[4]=new IcecreamDTO(35,"apple","greenapple",180);
	
	
IcecreamDAO dao= new IcecreamDAO();
for(int i=0; i<dto.length;i++) {
	System.out.println(dao.save(dto[i]));
}
IcecreamDAO dao2 =new IcecreamDAO();
for(int i=0; i<dto.length;i++) {
	System.out.println(dao2.delete(dto[i].getId()));
}
}
}