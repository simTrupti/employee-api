package com.example.employee_api.model;

public class Employee {
    private int id;
    private String name;
    private String city;

    public Employee(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    // Getters (so Spring can convert to JSON automatically)
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCity() { return city; }
}
