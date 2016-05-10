package com.github.monchenkoid.java_eight.methodreference;

/**
 * @author Iryna Monchenko
 * @version on 06.05.2016
 */

public class ReferenceConstructors {

    public static void run() {
        EmployeeProvider provider = Employee::new;
        Employee emp = provider.getEmployee("John Doe", 47);
        System.out.printf("Name: %s%n", emp.name);
        System.out.printf("Age: %d%n", emp.age);
    }
}
    class Employee
    {
        String name;
        Integer age;

        Employee()
        {
            name = "unknown";
            age = 100;
        }

        Employee(String name, Integer age)
        {
            this.name = name;
            this.age = age;
        }
    }

    @FunctionalInterface
    interface EmployeeProvider
    {
        Employee getEmployee(String name, Integer age);
    }
