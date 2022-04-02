package springrest.assignment.Q3;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Address")
public class Address {

	@Id
	private ObjectId _id;
	private Integer zipcode;
	private String state;
	private String city;
	private String country;

	public Address() {
	}

	public Address(String state, String city, String country) {
		super();

		this.state = state;
		this.city = city;
		this.country = country;
	}

	public Address(Integer zipcode, String state, String city, String country) {
		super();
		this.zipcode = zipcode;
		this.state = state;
		this.city = city;
		this.country = country;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "{ state=" + state + ", city=" + city + ", country=" + country + "}";
	}


}
