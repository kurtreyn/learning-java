package com.examples;

public class StudentUsingInheritanceRunner {

	public static void main(String[] args) {
		StudentUsingInheritance student = new StudentUsingInheritance("Scarlett", "UofL");

		Person person = new Person("Scarlett");
		Employee employee = new Employee("Scarlett", "Optimitrist");

		employee.setEmail("scarlett@work.com");
		employee.setPhoneNumber("502-222-5555");
		employee.setEmployeeGrade('A');

		System.out.println(employee);

	}

}
