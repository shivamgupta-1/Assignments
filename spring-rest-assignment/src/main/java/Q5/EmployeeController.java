package Q5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employee/findAll")
	public List<Employee> getAll() {
		return employeeService.findAll();
	}

	@GetMapping("/employee/{employeeName}")
	public Employee findByName(@PathVariable String employeeName) {
		return employeeService.findByEmployeeName(employeeName);
	}

	@PostMapping("/employee/")
	public String add(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return "Employee is added";
	}

	@DeleteMapping("/employee/{employeeId}")
	public String delete(@PathVariable int employeeId) {
		employeeService.deleteEmployee(employeeId);
		return "Employee is deleted  of Id" + employeeId;
	}

	@PutMapping("/employee/{employeeId}")
	public String update(@PathVariable int employeeId, @RequestBody Employee employee) {
		employeeService.updateEmployee(employeeId, employee);
		return "Employee " + employeeId + "is updated";
	}

}
