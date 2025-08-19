package com.sujata.oop;

public class Factorial {

	private int number,factorial;

		public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		calculate();
		return factorial;
	}

	private void calculate() {
		factorial=1;
		while(number>=1) {
			factorial*=number--;
		}
	}
	
}
