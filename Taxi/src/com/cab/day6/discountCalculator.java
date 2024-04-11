package com.cab.day6;
import java.util.Scanner;
public class discountCalculator {
	public static double discab(double amount) {
		Scanner dc = new Scanner(System.in);
		
		if(amount > 2000 && amount < 5000) {
			System.out.println("You have discount of 2% !");
			System.out.println("Do you wanna apply your coupon ? ");
			char ans1input = dc.next().charAt(0);
			if( ans1input == 'Y' || ans1input == 'y' ) 
			
			{
				System.out.println("Enter your coupon code : ");
				String copcode =dc.next().toUpperCase().trim();
				if(copcode.equalsIgnoreCase("COUP_2"))
				{
					double coup1Amount = amount*0.02;
					double finalAmount = amount - coup1Amount;
					System.out.println("Your price before applying coupon "+amount);
					System.out.println("Your price after applying coupon : "+finalAmount);
				}
				}
			else if(ans1input == 'N' || ans1input == 'n') {
				System.out.println("Your price is : "+amount);
			}	
			}
		else if(amount >= 5000)
		{
			
			double finalAmount = 0;
			System.out.println("You have discount of 5% !");
			System.out.println("Do you wanna apply your coupon ? ");
			char ans2input = dc.next().charAt(0);
			if( ans2input == 'Y' || ans2input == 'y' ) 
			{
				System.out.println("Enter your coupon code : ");
				String copcode1 =dc.next().toUpperCase().trim();
				if(copcode1.equalsIgnoreCase("COUP_5"))
				
				{
					double coup2Amount = amount*0.02;
					 finalAmount = amount - coup2Amount;
					System.out.println("Your price before applying coupon "+amount);
					System.out.println("Your price after applying coupon : "+finalAmount);
				
			    }
		}
			else if(ans2input == 'N' || ans2input == 'n') {
				System.out.println("Your price is : "+amount);
			}
			
			
			else
			{
				System.out.println(amount);
			}
	}
		return amount;
	}
}
