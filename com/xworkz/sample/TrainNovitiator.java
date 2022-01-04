package com.xworkz.sample.statement.train;
import java.util.ArrayList;
import java.util.Collection;

public class TrainNovitiator {
	public static void main(String[] args) {
	TrainDTO dto =new TrainDTO(4,"local","goainterseptor","25l","mysore","goa", 1500, "4tyre");
	TrainDAO dao =new TrainDAO();
	System.out.println(dao.save(dto));
	System.out.println(dao.deleteByNo("goainterseptor"));
	System.out.println(dao.deleteByNoAndId("goainterseptor", 4));
	TrainDTO trainDTO=dao.getByNo("goainterseptor");
	System.out.println(trainDTO);
	Collection<TrainDTO> trains=dao.getAll(null);
	 trains.forEach((e)-> System.out.println(e));
	 Collection<TrainDTO> trains2=dao.getAllByBording("goa");
	 trains2.forEach((e)-> System.out.println(e));
	 Collection<TrainDTO> trains1 = dao. AllByDestination("mysore");
	 trains.forEach((e)-> System.out.println(e));
	 System.out.println(dao.updateDestinationAndBoardingByNo("mysore", "goa","goainterseptor"));
	 System.out.println(dao.updateDestinationByNo("mysore", "goainterseptor"));
	 System.out.println(dao.getTotal());
	 System.out.println(dao.getMaxPrice());
	 System.out.println(dao.getMinPrice());
	 
	}
		

        		
        		
        		
}