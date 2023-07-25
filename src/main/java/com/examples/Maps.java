package com.examples;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> employeeIds = new HashMap<>();
        employeeIds.put("John", 123);
        employeeIds.put("Jane", 456);
        System.out.println("John's employee id is " + employeeIds.get("John"));
        System.out.println("Jane's exists in map: " + employeeIds.containsKey("Jane"));
        System.out.println("Jane's employee id is " + employeeIds.get("Jane"));
        employeeIds.replace("Jane", 789);
        System.out.println("Jane's employee id is now " + employeeIds.get("Jane"));
        employeeIds.putIfAbsent("Steve", 123);
        System.out.println("Steve's employee id is " + employeeIds.get("Steve"));
    }
}
