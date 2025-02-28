package myMeal;

public class Order {
	private User orderUser;
	private Food orderFood;
	private String orderDate;
	static private int orderCount = 0;
	
	public Order(User orderUser, Food orderFood, String orderDate) {
		this.orderUser = orderUser;
		this.orderFood = orderFood;
		this.orderDate = orderDate;
		orderCount++;
	}

	public static int getCount() {
		return orderCount;
	}

	public User getOrderUser() {
		return orderUser;
	}

	public Food getOrderFood() {
		return orderFood;
	}

	public String getOrderDate() {
		return orderDate;
	}
}
