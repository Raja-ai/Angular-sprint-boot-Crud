package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Employee;

import java.util.List;

public interface EmployeeCustomRepository {
    List<Employee> searchByFirstnameOrLastnameOrEmail(String search);
}