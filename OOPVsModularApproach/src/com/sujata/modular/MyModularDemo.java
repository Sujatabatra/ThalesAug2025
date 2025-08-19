package com.sujata.modular;

public class MyModularDemo {

	static int number,factorial;
	
	static void input(int n) {
		number=n;
	}
	
	static void calculate() {
		factorial=1;
		while(number>=1) {
			factorial*=number--;
		}
		
	}
	
	static void displayResult() {
		System.out.println("Factorial : "+factorial);
	}
	
	public static void main(String[] args) {
		input(4);
		calculate();
		factorial=0; //Logical error
		displayResult();

	}

}
