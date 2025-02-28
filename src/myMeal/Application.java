package myMeal;

import java.util.ArrayList;

public class Application {
	ArrayList<Food> foods;
	ArrayList<Order> orders;
	
	
	
	public Application() {
		foods = new ArrayList<Food>();
		orders = new ArrayList<Order>();
	}

	public void addNewFood(Food food1) {
		foods.add(food1);
		System.out.println(food1.getFoodName() + " was successfully added to the kitchen!");
	}

	public void displayFoods() {
		System.out.println("Food List:");
		System.out.println("-------------------------------------------------");
		for (Food food : foods) {
			System.out.println(food.getFoodName() + " (" + food.getKcal() + " Kcal)");
			System.out.println("Description: " + food.getFoodDescription());
			System.out.println("Spicy Level: " + food.getSpicyLevel());
			System.out.println("Ingredients: ");
			for (Ingredient ingredient : food.getIngredients()) {
				System.out.print(ingredient.getIngredient() + ", ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------");
		}
	}

	public void order(User firstUser, Food food1, String string) {
		orders.add(new Order(firstUser, food1, string));
		System.out.println(firstUser.getUserName() + " ordered " + food1.getFoodName() + " on " + string);
	}

	public void displayOrders() {
		System.out.println("Order List:");
		System.out.println("----------------------------------------------");
		for (Order order : orders) {
			System.out.println("User: " + order.getOrderUser().getUserName() + " - " + order.getOrderUser().getUserName());
			System.out.println("Food: " + order.getOrderFood().getFoodName());
			System.out.println("Date: " + order.getOrderDate());
			System.out.println("----------------------------------------------");
		}
	}

}
