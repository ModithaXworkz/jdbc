package com.xworkz.state;

public class StateDTO {

	private int id;
	private String name;
	private int code;
	private String capital;
	public StateDTO() {
		
	}
	public StateDTO(int id, String name, int code, String capital) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.capital = capital;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getCode() {
		return code;
	}
	public String getCapital() {
		return capital;
	}
	@Override
	public String toString() {
		return "StateDTO [id=" + id + ", name=" + name + ", code=" + code + ", capital=" + capital + "]";
	}

}