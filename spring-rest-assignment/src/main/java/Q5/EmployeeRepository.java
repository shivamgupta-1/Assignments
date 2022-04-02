package Q5;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

	public Employee findByEmployeeName(String employeeName);
}
