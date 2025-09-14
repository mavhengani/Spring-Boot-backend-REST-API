package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootSetupApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSetupApplication.class, args);
	}

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        /*Employee employee = new Employee();
        employee.setFirstname("Rotondwa");
        employee.setLastName("Mavhengani");
        employee.setEmail("Rotondwa@gmail.com");
        employeeRepository.save(employee);

        Employee employee1 = new Employee();
        employee1.setFirstname("Roto");
        employee1.setLastName("Mavhe");
        employee1.setEmail("Roto@gmail.com");
        employeeRepository.save(employee1);

        Employee employee2 = new Employee();
        employee2.setFirstname("Janti");
        employee2.setLastName("Mavhengani");
        employee2.setEmail("Janti@gmail.com");
        employeeRepository.save(employee2);

        Employee employee3 = new Employee();
        employee3.setFirstname("Moses");
        employee3.setLastName("Mavhen");
        employee3.setEmail("Moses@gmail.com");
        employeeRepository.save(employee3);*/

    }
}
