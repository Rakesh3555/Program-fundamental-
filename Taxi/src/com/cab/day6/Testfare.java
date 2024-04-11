package com.cab.day6;
import java.util.Scanner;
public class Testfare {

	public static void main(String[] args) {
		Scanner dc = new Scanner(System.in);
			cab tf = new cab();	
			double amount=tf.cabFare();
			System.out.println("the amount "+amount);
	        discountCalculator.discab(amount);
	}

}
