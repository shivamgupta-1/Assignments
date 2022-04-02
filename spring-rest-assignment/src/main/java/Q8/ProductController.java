package Q8;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}

	@PutMapping("/product/{id}")
	public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
		return productRepository.save(product);
	}

	@DeleteMapping("/product/{id}")
	public String deleteProduct(@PathVariable int id) {
		productRepository.deleteById(id);
		return "Your product with id " + id + " is deleted";
	}

	@GetMapping("/product/{id}")
	public Optional<Product> getProductById(@PathVariable int id) {
		return productRepository.findById(id);
	}

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
}
