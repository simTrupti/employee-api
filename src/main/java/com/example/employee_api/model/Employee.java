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

    // Getters and Setters (so Spring can convert to JSON automatically)
    public int getId() { return id; }
    public void setId(int id){ this.id = id;}

    public String getName() { return name; }
    public void setName(String name){ this.name = name;}

    public String getCity() { return city; }
    public void setCity(String city){ this.city = city;}
}
