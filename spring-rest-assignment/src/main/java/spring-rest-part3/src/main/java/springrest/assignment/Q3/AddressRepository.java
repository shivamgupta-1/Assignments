package springrest.assignment.Q3;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address, Integer> {

	Address findByZipcode(Integer zipcode);


}
