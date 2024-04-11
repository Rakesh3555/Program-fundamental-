/*cab fare
Enter the km: 10
Enter Cab Type : Prime

Choose the cab type:
* Micro ( Rs.10 per km )
* Mini ( Rs.15 per km )
* Prime (Rs.20 per km)

Calculate the cab fare

ECommerce Discount Calculation and Coupon Code
* Get total bill : 3000
Get the needed details from User.
Discount Rules:
* 2% discount for bill amount greater than 2000
* 5% discount for bill amount greater than 5000
Coupon Code:
* COUP_2 means 2% discount on bill amount
* COUP_5 means 5% discount on bill amount*/
package com.cab.day6;
import java.util.*;
public class Cab {
	public static double cabFare() {
		Scanner cf = new Scanner(System.in);
		System.out.println("Taxi booking !");
		System.out.println("");
		System.out.println("Choose cab type !\n 1) Micro ( Rs.10 per km )\n 2) Mini ( Rs.15 per km )\n 3) Prime ( Rs.20 per km )");
		System.out.println("");
	
		double km ;
		System.out.println("Enter number of km :");
		km = cf.nextDouble();
	
		System.out.println("Enter you cab type : ");
		char ty = cf.next().charAt(0);
		double amount = 0;
		switch(ty) {
		case'1':
			amount = km*10;
			break;
		case'2':
			amount = km*15;
			break;
		case'3':
			amount = km*20;
			break;
		default:
			System.out.println("Invalid taxi type ! ");
			break;
		}
		System.out.println("Your fare amount :"+amount);
		return amount;
		
	}	

}


