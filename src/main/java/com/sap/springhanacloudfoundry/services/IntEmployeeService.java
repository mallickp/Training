package com.sap.springhanacloudfoundry.services;
import java.util.List;
import java.util.Optional;

import com.sap.springhanacloudfoundry.models.Employee;

public interface IntEmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(long id);
    Employee updateEmployee(Employee updatedEmployee);
    void deleteEmployee(long id);
}