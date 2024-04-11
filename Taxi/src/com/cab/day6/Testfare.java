package com.cab.day6;

import java.util.Scanner;

public class Testfare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			Scanner dc = new Scanner(System.in);
			cab tf = new cab();	
			double amount=tf.cabFare();
			System.out.println("the amount "+amount);
	        discountCalculator.discab(amount);
			
				

	}

}
