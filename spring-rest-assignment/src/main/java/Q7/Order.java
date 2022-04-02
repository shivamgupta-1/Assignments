package Q7;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "Order")
public class Order {
	@Id
	private int orderId;
	private String category;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate purchaseDate;
	private int orderPrice;

	Order() {
	}

	public Order(int orderId, String category, LocalDate purchaseDate, int orderPrice) {
		super();
		this.orderId = orderId;
		this.category = category;
		this.purchaseDate = purchaseDate;
		this.orderPrice = orderPrice;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", category=" + category + ", purchaseDate=" + purchaseDate
				+ ", orderPrice=" + orderPrice + "]";
	}

}
