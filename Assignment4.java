package session2;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print number of days in a month!!");
		System.out.print("Enter a month: ");
		Scanner day = new Scanner(System.in);
		String month = day.next();
		
		switch (month) {
		case "Janurary":
			System.out.println("Total number of days in " + month + " is " + "31 days");
			break;
		case "February":
			System.out.println("Total number of days in " + month + " is " + "28 days");
			break;
		case "March":
			System.out.println("Total number of days in " + month + " is " + "31 days");
			break;
		case "April":
			System.out.println("Total number of days in " + month + " is " + "30 days");
			break;
		case "May":
			System.out.println("Total number of days in " + month + " is " + "31 days");
			break;
		case "June":
			System.out.println("Total number of days in " + month + " is " + "30 days");
			break;
		case "July":
			System.out.println("Total number of days in " + month + " is " + "31 days");
			break;
		case "August":
			System.out.println("Total number of days in " + month + " is " + "31 days");
			break;
		case "September":
			System.out.println("Total number of days in " + month + " is " + "30 days");
			break;
		case "October":
			System.out.println("Total number of days in " + month + " is " + "31 days");
			break;
		case "November":
			System.out.println("Total number of days in " + month + " is " + "30 days");
			break;
		case "December":
			System.out.println("Total number of days in " + month + " is " + "31 days");
			break;	
		default:
			System.out.println("End of a Month.");
			break;
		}
		
		
	}

}
