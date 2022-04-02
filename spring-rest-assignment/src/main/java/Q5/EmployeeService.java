package Q5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee findByEmployeeName(String employeeName) {
		return employeeRepository.findByEmployeeName(employeeName);
	}

	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}

	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	public Employee updateEmployee(int id, Employee employee) {
		return employeeRepository.save(employee);
	}
}
