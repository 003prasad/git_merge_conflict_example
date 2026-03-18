package com.sms;
import java.util.Scanner;
public class MainApp {
	public static void main(String args[]) {
		
		StudentDAO dao = new StudentDAO();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n 1. Add Student ");
			System.out.println("\n 2. view Students ");
			System.out.println("\n 3. Exit ");
			System.out.print("Choose :  ");
			
			int ch= sc.nextInt();
			sc.nextLine();
			
			switch(ch) {
			case 1: 
				System.out.print("Name : ");
				String name= sc.nextLine();
				System.out.print("Email : ");
				String email= sc.nextLine();
				System.out.print("Course : ");
				String course= sc.nextLine();
				
				Student s = new Student(name, email, course);
				dao.addStud(s);
				break;
			
			case 2:
				dao.viewStudents();
				break;
				
			case 3:
				System.out.println("Thank you ");
				System.exit(0);
			}
		}
	}
}
