package Q9;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerRepository.save(customer);

	}

	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerRepository.save(customer);

	}

	@DeleteMapping("/customer/{id}")
	public String deleteCustomer(@PathVariable int id) {
		customerRepository.deleteById(id);
		return "Customer with id " + id + "is deleted";

	}

	@GetMapping("/customer/{id}")
	public Optional<Q9.Customer> Customer(@PathVariable int id) {
		return customerRepository.findById(id);

	}

	@GetMapping("/customers")
	public Iterable<Q9.Customer> getAllCustomer() {
		return customerRepository.findAll();
	}
}
