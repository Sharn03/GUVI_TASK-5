package TASK_5;
import java.util.Scanner;
import java.time.*;  
import java.util.*;
public class calculatingtheAge {
public static void main(String[] args) {
	  
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Date Of Birth (yyyy-mm-dd):");
	String str = s.nextLine();
	
	//Getting DOB from the user as String and Converting into the date using parse Method.
	LocalDate dob = LocalDate.parse(str);  
	
	//Getting the Current Date
	LocalDate currentDate = LocalDate.now();  
	
	//calculating  the difference between two dates via Period class which has between method  
	Period period = Period.between(dob, currentDate); 
	
	//Here we are using the format Specifier to print the following in the crt format
	System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());  

	s.close();
	
}
}
