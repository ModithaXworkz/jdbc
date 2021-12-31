package com.xworkz.state;

public class StateNovitiator {
	public static void main(String[] args) {
		StateDTO dto[] =new StateDTO[3];
		dto[0]= new StateDTO(2,"maharastra",54,"mumbai");
		dto[1]= new StateDTO(5,"goa",89,"dontknow");
		dto[2]=new StateDTO(8,"nepal",545,"gfds");
		
		
		StateDAO dao=new StateDAO();
		for(int i=0;i<dto.length;i++) {
			System.out.println(dao.save(dto[i]));
		
		}
		
		StateDAO dao1 =new StateDAO();
		for(int i=0; i<dto.length;i++) {
			System.out.println(dao1.delete(dto[i].getId()));
		}
	}
	

}
