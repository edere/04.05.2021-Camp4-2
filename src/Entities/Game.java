package Entities;

import Abstract.Entity;

public class Game implements Entity{

	private int Id;
	private String Name;
	private int Price;
	
	public Game() {
		
	}

	public Game(int id, String name, int price) {
		super();
		Id = id;
		Name = name;
		Price = price;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}
}
