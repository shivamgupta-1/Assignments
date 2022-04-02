package Q9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(Customer.class)
class CustomerControllerTest {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	CustomerRepository customerRepository;

	@MockBean
	CustomerController customerController;

	Customer customer1 = new Customer(1, "shivam", "gupta", "parao", "varanasi", "Up", " 11811", "India");
	Customer customer2 = new Customer(2, "anuj", "gupta", "parao", "varanasi", "Up", " 11811", "India");
	Customer customer3 = new Customer(3, "ashish", "gupta", "parao", "varanasi", "Up", " 11811", "India");

	List<Customer> customers = new ArrayList<>();


	@Test
	void addCustomer() {
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		Mockito.when(customerRepository.save(customer1)).thenReturn(customer1);

	}

	@Test
	void updateCustomer() {
		Customer updateCustomer2 = new Customer(2, "anuj2", "gupta", "parao", "varanasi", "Up", " 11811", "India");
		Customer updated = new Customer(2, "anuj2", "gupta", "parao", "varanasi", "Up", " 11811", "India");

		Mockito.when(customerRepository.save(updateCustomer2)).thenReturn(updated);
	}

	@Test
	void deleteCustomer() {

		Mockito.when(customerController.deleteCustomer(2)).thenReturn("Customer with id  2 is deleted");
	}

	@Test
	void getCustomerById() {
		Optional<Customer> customerFind = Optional
				.ofNullable(new Customer(1, "shivam", "gupta", "parao", "varanasi", "Up", " 11811", "India"));
		Mockito.when(customerRepository.findById(1)).thenReturn(customerFind);
	}

	@Test
	void getAllCustomers() {
		Mockito.when(customerRepository.findAll()).thenReturn(customers);
	}

}
