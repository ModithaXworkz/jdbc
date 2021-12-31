package com.xworkz.smp;

public class CountryDTO {
	private int id;
	private String name;
	private String code;
	private  String continent;
	
	public CountryDTO(int id, String name, String code, String continent) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.continent = continent;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public String getContinent() {
		return continent;
	}

	@Override
	public String toString() {
		return "CountryDTO [id=" + id + ", name=" + name + ", code=" + code + ", continent=" + continent + "]";
	}
	

}
