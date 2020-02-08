package com.epamcvrce;

public class Chocolate implements Gift{
	int price,weight,cal_amt;
	String name;
	public Chocolate(int price, int weight,String name,int cal_amt) {
		super();
		this.price = price;
		this.weight = weight;
		this.name=name;
		this.cal_amt=cal_amt;
	}
	public int getPrice()
	{
		return price;
	}
	public int getWeight()
	{
		return weight;
	}
	public String getName() {
		return name;
	}
	public int getCal_amt()
	{
		return cal_amt;
	}
	@Override
	public String toString() {
		return "Name=" +  name + " [price=" + price + ", weight=" + weight  + "]";
	}
}
