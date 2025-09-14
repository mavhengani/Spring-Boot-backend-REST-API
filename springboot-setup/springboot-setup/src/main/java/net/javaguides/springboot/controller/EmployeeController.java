package net.javaguides.springboot.controller;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/empoyees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    //building create employee
    @PostMapping
    public  Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
    //get employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not exist with Id:" +id));
        return ResponseEntity.ok(employee);
    }
    // bild update
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employeeDetails) {
        Employee updateemployeeDetail = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not exist with Id:" +id));
        updateemployeeDetail.setFirstname(employeeDetails.getFirstname());
        updateemployeeDetail.setLastName(employeeDetails.getLastName());
        updateemployeeDetail.setEmail(employeeDetails.getEmail());

        employeeRepository.save(updateemployeeDetail);
        return ResponseEntity.ok(updateemployeeDetail);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not exist with Id:" +id));
        employeeRepository.delete(employee);
        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
