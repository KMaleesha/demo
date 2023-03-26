package com.example.demo.service.Impl;

import com.example.demo.domain.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Component
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public String deleteEmployee(int id) {
        Optional<Employee> optinalEmp = employeeRepository.findById(id);

        if (optinalEmp.isPresent()) {
            employeeRepository.delete(optinalEmp.get());
            return "";
        }else {
            return "";
        }
    }
}
