package encapsulation3;

import java.util.Scanner;

public class HrDeptt {
	
private int salary = 20000;
	
	
	public int getSalary() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name");
		String empName = sc.nextLine();
		if(empName.equalsIgnoreCase("Aniket Kharde")) {
			System.out.println("Enter Password");
		}
		else {
			System.out.println("Employee not found");
			return getSalary();
		}
		
		String password = sc.nextLine();
		if(password.equals("Aniket@123")) {
			return salary;
		}
		else {
			return (Integer) null;
		}
	}

}
