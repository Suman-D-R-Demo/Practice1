package kodnest_java;

import java.util.Scanner;

public class StudendApp {

	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name");
		s1.name = sc.nextLine();
		System.out.println("Enter the student rollNumber");
		s1.rollNumber = sc.nextInt();
		System.out.println("Enter the student cgpa");
		s1.cgpa = sc.nextDouble();
		System.out.println("Student "+s1.name+" of rollNumber "+s1.rollNumber+" has cgpa as "+s1.cgpa);
		System.out.println("Enter the student name");
		sc.nextLine();
		s2.name = sc.nextLine();
		System.out.println("Enter the student rollNumber");
		s2.rollNumber = sc.nextInt();
		System.out.println("Enter the student cgpa");
		s2.cgpa = sc.nextDouble();
		sc.close();
		System.out.println("Student "+s2.name+" of rollNumber "+s2.rollNumber+" has cgpa as "+s2.cgpa);
		

	}

}
