package com.example.employee_api.web;

import com.example.employee_api.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    // Hardcoded static list
    private static final List<Employee> EMPLOYEES = List.of(
            new Employee(1, "Asha", "Bengaluru"),
            new Employee(2, "Rohit", "Pune"),
            new Employee(3, "Meera", "Bengaluru"),
            new Employee(4, "Vikram", "Mumbai"),
            new Employee(5, "Priya", "Delhi")
    );

    // 1) GET /employees → returns all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return EMPLOYEES;
    }


    // 2) GET /employees/city/{city} → returns employees in a given city
    @GetMapping("/city/{city}")
    public List<Employee> getEmployeesByCity(@PathVariable String city) {
        return EMPLOYEES.stream().filter(e ->e.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
}
    // 3) POST
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        EMPLOYEES.add(employee);
        return employee;
    }
}


