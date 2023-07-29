package com.Udemy.databases;

import java.util.Scanner;

public class UserInput {
    private String name;
    private int phone;
    private String email;



    public UserInput(String name, int phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        System.out.println("User created." + "\nName: " + name + "\nPhone: " + phone + "\nEmail: " + email);
    }

    public static UserInput createUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        int phone = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        return new UserInput(name, phone, email);
    }


    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
