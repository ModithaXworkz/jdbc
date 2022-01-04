package com.xworkz.sample.statement.train;

import com.xworkz.sample.statement.train.TrainDAO;
import com.xworkz.sample.statement.train.TrainDTO;

public class TrainNovitiator {
	public static void main(String[] args) {
        		
        		TrainDTO train = new TrainDTO();
        		
        	TrainDAO dao = new TrainDAO();
        		boolean save = dao.save(train);
        		dao.getByNo("");
        		dao.getAll(train);
        		dao.getAllByBording();
        		dao.AllByDestination();
        		
	}

        		
        		
        		
}