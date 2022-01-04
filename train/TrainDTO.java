package com.xworkz.sample.statement.train;


public class TrainDTO {
	private int id;
	private String name;
	private String no;
	private String seatNo;
	private String boarding;
	private String destination;
	private int price;
	private String klass;
	public TrainDTO() {
		
	}
	public TrainDTO(int id, String name, String no, String seatNo, String boarding, String destination, int price,
			String klass) {
		super();
		this.id = id;
		this.name = name;
		this.no = no;
		this.seatNo = seatNo;
		this.boarding = boarding;
		this.destination = destination;
		this.price = price;
		this.klass = klass;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getNo() {
		return no;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public String getBoarding() {
		return boarding;
	}
	public String getDestination() {
		return destination;
	}
	public int getPrice() {
		return price;
	}
	public String getKlass() {
		return klass;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setKlass(String klass) {
		this.klass = klass;
	}
	@Override
	public String toString() {
		return "TrainDTO [id=" + id + ", name=" + name + ", no=" + no + ", seatNo=" + seatNo + ", boarding=" + boarding
				+ ", destination=" + destination + ", price=" + price + ", klass=" + klass + "]";
	}
	

}
