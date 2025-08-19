package com.sujata.demo;

public class CarRentalSystem {

	public static void main(String[] args) {
		Driver sonu=new Driver("Sonu");
		Driver ramesh=new Driver("Ramesh");
		
		Audi audi=new Audi("Red", "Q3");
		BMW bmw=new BMW("White","X6");
		Car car=new Toyota("Golden", "Altis");
		
		ramesh.setCar(audi);
		ramesh.drive();

	}

}
