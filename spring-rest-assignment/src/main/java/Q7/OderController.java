package Q7;

import java.util.List;
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
public class OderController {

	@Autowired
	private OrderRepository orderRepository;

	@PostMapping("/order")
	public String placeOrder(@RequestBody Order order) {
		orderRepository.save(order);
		return "Your order is placed";
	}

	@PutMapping("/order/{orderId}")
	public String updateOrder(@PathVariable int orderId, @RequestBody Order order) {
		orderRepository.save(order);
		return "Your order is updated";
	}

	@GetMapping("/order/{orderId}")
	public Optional<Order> getOrderByid(@PathVariable int orderId) {
		return orderRepository.findById(orderId);
	}

	@GetMapping("/orders")
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	@DeleteMapping("/order/{orderId}")
	public String deleteOrderById(@PathVariable int orderId) {
		orderRepository.deleteById(orderId);
		return "your order is deleted";
	}

}
