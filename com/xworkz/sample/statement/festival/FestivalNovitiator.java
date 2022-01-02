package com.xworkz.sample.statement.festival;

import com.xworkz.sample.statement.festival.*;

public class FestivalNovitiator {
	public static void main(String[] args) {

		FestivalDTO festival = new FestivalDTO(8, "Onam", "2022-08-12", "Kerala");

		FestivalDAO dao = new FestivalDAO();
		boolean save = dao.saveDTO(festival);
		// System.out.println(save);
		// dao.deleteById(2);
		dao.displayById(1);
		dao.displayAll();
		dao.displayTotalNoOfRecords();

	}
}