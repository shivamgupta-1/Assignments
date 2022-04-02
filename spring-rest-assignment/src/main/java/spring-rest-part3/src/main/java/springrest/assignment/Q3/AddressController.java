package springrest.assignment.Q3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

	@Autowired
	private AddressRepository addressRepository;




	@GetMapping("/address/{zipcode}")
	public String findById(@PathVariable int zipcode) {
		String city = addressRepository.findByZipcode(zipcode).getCity();
		String state = addressRepository.findByZipcode(zipcode).getState();
		String country = addressRepository.findByZipcode(zipcode).getCountry();

		return new Address(state, city, country).toString();

	}

	// extra code
	@PostMapping("/address/addAddress")
	public String saveAddress(@RequestBody Address address) {
		addressRepository.save(address);
		return "Your address is saved";

	}

	@GetMapping("/findAll")
	public List<Address> getAllAddress() {
		return addressRepository.findAll();

	}


	@DeleteMapping("/address/{zipcode}")
	public String deleteAddress(@PathVariable int zipcode) {
		addressRepository.deleteById(zipcode);
		return "Your address is deleted";
	}


}

