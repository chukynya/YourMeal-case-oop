package myMeal;

import java.util.ArrayList;

public class Food {
	private String foodName;
	private String foodDescription;
	private int spicyLevel;
	private int kcal;
	private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

	public Food(String foodName, String foodDescription, int spicyLevel, int kcal) {
		this.foodName = foodName;
		this.foodDescription = foodDescription;
		this.spicyLevel = spicyLevel;
		this.kcal = kcal;
	}

	public void addIngredient(Ingredient ingredient) {
		ingredients.add(ingredient);
	}

	public String getFoodName() {
		return foodName;
	}

	public String getFoodDescription() {
		return foodDescription;
	}

	public int getSpicyLevel() {
		return spicyLevel;
	}

	public int getKcal() {
		return kcal;
	}

	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}
}
