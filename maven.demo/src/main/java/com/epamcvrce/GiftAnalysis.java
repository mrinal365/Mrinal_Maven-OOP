package com.epamcvrce;
import java.util.*;
public class GiftAnalysis {
	static List<Sweet> sweets=new ArrayList<Sweet>();
	static List<Chocolate> chocolates=new ArrayList<Chocolate>();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		inputSweets();
		inputChocloates();
		while(true)
		{
			System.out.println("MENU");
			System.out.println("1.display Chocoltes and Sweets");
			System.out.println("2.display Weight Of The Gift");
			System.out.println("3.display Candies In The Gift");
			System.out.println("4.Filter");
			System.out.println("5.Exit()");
			int choice=sc.nextInt();
			 switch(choice)
			 {
			 case 1:
				 display();
				 break;
			 case 2:
				 System.out.println("The total weight of the gift:"+calcWeight());
				 break;
			 case 3:
				 System.out.println("The Candies are:");
				 candyDisplay();
				 break;
			 case 4:
				 System.out.println("Filter the chocolates and sweets according to: 1.Price 2.Weight");
				 int ch=sc.nextInt();
				 filter(ch);
				 break;
			 case 5:
				 System.out.println("ThankYou");
				 System.exit(0);
			default:
				 System.out.println("Invlaid Choice!!Try Again!!");
			 }
		}
	}
	public static void inputSweets()
	{
		System.out.println("input no of sweets:");
		for(int n=sc.nextInt();n>0;n--)
		{
			System.out.println("input weight of the sweet:");
			int weight=sc.nextInt();
			System.out.println("input price of the sweet:");
			int price=sc.nextInt();
			System.out.println("input name of the sweet:");
			String name=sc.next();
			Sweet sweet=new Sweet(price,weight,name);
			sweets.add(sweet);
		}
	}
	
	
	public static void inputChocloates()
	{
		System.out.println(" no of chocolates:");
		for(int n=sc.nextInt();n>0;n--)
		{
			System.out.println("input weight of the chocolate:");
			int weight=sc.nextInt();
			System.out.println("input price of the chocolate:");
			int price=sc.nextInt();
			System.out.println("input type of chocolate: 1.Candy 2.Chocolate");
			int cat=sc.nextInt();
			System.out.println("input name of the chocolate:");
			String name=sc.next();
			Chocolate chocolate=new Chocolate(price,weight,name,cat);
			chocolates.add(chocolate);
		}
	}		
	public static int calcWeight()
	{
		int totalWeight=0;
		for(Chocolate choco:chocolates)
			totalWeight+=choco.getWeight();
		for(Sweet sweet:sweets)
			totalWeight+=sweet.getWeight();
		return totalWeight;
	}
	public static void candyDisplay()
	{
		for(Chocolate choco:chocolates)
		{
			if(choco.getCal_amt()==1)
				System.out.println(choco.toString());
		}
	}
	public static void filter(int ch) 
	{
		int lower,higher;
		if(ch==1)
		{
			System.out.println("lower price limit:");
			lower=sc.nextInt();
			System.out.println("upper price limit:");
			higher=sc.nextInt();
			for(Chocolate choco:chocolates)
			{
				if(choco.getPrice()>=lower&&choco.getPrice()<=higher)
					System.out.println(choco.toString());
			}
			for(Sweet sweet:sweets)
			{
				if(sweet.getPrice()>=lower&&sweet.getPrice()<=higher)
					System.out.println(sweet.toString());
			}
		}
		else
		{
			System.out.println("lower weight limit:");
			lower=sc.nextInt();
			System.out.println("weight limit:");
			higher=sc.nextInt();
			for(Chocolate choco:chocolates)
			{
				if(choco.getWeight()>=lower&&choco.getWeight()<=higher)
					System.out.println(choco.toString());
			}
			for(Sweet sweet:sweets)
			{
				if(sweet.getWeight()>=lower&&sweet.getWeight()<=higher)
					System.out.println(sweet.toString());
			}
		}
	}
	public static void display()
	{
		for(Chocolate choco:chocolates)
				System.out.println(choco.toString());
		for(Sweet sweet:sweets)
				System.out.println(sweet.toString());
	}
}