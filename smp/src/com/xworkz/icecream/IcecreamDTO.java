package com.xworkz.icecream;

public class IcecreamDTO {
	private int id;
	private String name;
	private String flavour;
	private int rate;
	public IcecreamDTO() {
		
	}
	public IcecreamDTO(int id, String name, String flavour, int rate) {
		super();
		this.id = id;
		this.name = name;
		this.flavour = flavour;
		this.rate = rate;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getFlavour() {
		return flavour;
	}
	public int getRate() {
		return rate;
	}
	@Override
	public String toString() {
		return "IcecreamDTO [id=" + id + ", name=" + name + ", flavour=" + flavour + ", rate=" + rate + "]";
	}
}
