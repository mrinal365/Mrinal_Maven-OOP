package com.epamcvrce;
public class Sweet implements Gift {
	int price,weight;
	String name;
	public Sweet(int price, int weight,String name) {
		super();
		this.price = price;
		this.weight = weight;
		this.name=name;
	}
	public int getPrice() {
		return price;
	}
	public int getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Name=" +  name + " [price=" + price + ", weight=" + weight  + "]";
	}
}
