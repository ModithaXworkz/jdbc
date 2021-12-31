package com.xworkz.smp;

public class CountryNovitiator {
	public static void main(String[] args) {
		CountryDTO dto[]=new CountryDTO[5];
		dto[0]= new CountryDTO(1,"africa","+27","asia1");
		dto[1]=new CountryDTO(3, "usa", "+1", "dontknow");
		dto[2]=new CountryDTO(6, "bangladesh", "+880", "asia2");
		dto[3]=new CountryDTO(4, "pak", "+92", "asia4");
		dto[4]= new CountryDTO(5, "london", "+020", "europe");
		
		CountryDAO dao=new CountryDAO();
		for(int i=0;i<dto.length;i++) {
			System.out.println(dao.save(dto[i]));
		}
//	CountryDAO dao1 =new CountryDAO();
//	for(int i=0; i<dto.length;i++) {
//		System.out.println(dao1.delete(dto[i].getId()));
//	}
	}
}
