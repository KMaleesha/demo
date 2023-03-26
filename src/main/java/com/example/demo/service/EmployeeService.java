package com.example.demo.service;

import com.example.demo.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {

   public Employee saveEmployee(Employee employee);

   public List<Employee> getAll();

   public Optional<Employee> getById(int id);

   public String deleteEmployee(int id);
}
