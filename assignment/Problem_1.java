package com.assignment;

public class Problem_1 {
	
	static void City(String city) {
		
		switch(city)
		{
		case "Mumbai":
			System.out.println("Financial City");
			break;
			
		case "Kolkata":
			System.out.println("City of Joy");
			break;
			
		case "Delhi":
			System.out.println("Capital of the country");
			break;
			
		case "Bangalore":
			System.out.println("Cyber City");
			break;
			
		default :
			System.out.println("May be Other Indian City");
			break;
		}
	}

	public static void main(String[] args) {

		String city = "Bangalore";
		
		City(city);

	}

}
