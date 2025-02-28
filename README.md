# YourMeal-case-oop

# Duration :  90 minutes

# Learning Outcomes

- Implementing how to use  multiple classes in object oriented programming
- Implementing how to use Wrapper Class data type
- Implementing how to use *static* keyword
- Implementing how to use encapsulation concept
- Implementing how to use class relationships using Java (Association, Aggregation, Composition)

# Main Class
```
public class Main {
    public static void main(String[] args) {
        Application yourMeal = new Application();

        User firstUser = new User("0789", "Josh Ronaldo");
        User secondUser = new User("9083", "Kukilo Seto");

        Food food1 = new Food("Bento", "Bento atau dalam bahasa jepang disebut o-bento merupakan makanan bekal yang berupa nasi dan lauk pauk yang dikemas secara praktis.", 1, 470);

        food1.addIngredient(new Ingredient("Steam Rice"));
        food1.addIngredient(new Ingredient("Beef blackpepper"));
        food1.addIngredient(new Ingredient("Chicken Teriyaki"));
        food1.addIngredient(new Ingredient("Japanesse Chicken sauce"));
        food1.addIngredient(new Ingredient("Ekado"));
        food1.addIngredient(new Ingredient("Tori no teba"));
        food1.addIngredient(new Ingredient("Egg Chicken roll"));
        food1.addIngredient(new Ingredient("Coleslaw"));
        food1.addIngredient(new Ingredient("Chili Sauce"));
        food1.addIngredient(new Ingredient("Tomato Sauce"));
        food1.addIngredient(new Ingredient("Mayonese"));

        Food food2 = new Food("Tokyo Beef Humberg", "Tokyo Beef Hamburg merupakan makanan barat bergaya jepang", 1, 683);

        food2.addIngredient(new Ingredient("Beef Patty"));
        food2.addIngredient(new Ingredient("Potato Wedges"));
        food2.addIngredient(new Ingredient("Carrot"));
        food2.addIngredient(new Ingredient("Corn Kernel"));
        food2.addIngredient(new Ingredient("Brocoli"));
        food2.addIngredient(new Ingredient("Fried Egg"));
        food2.addIngredient(new Ingredient("Tonkatsu Sauce"));
        food2.addIngredient(new Ingredient("Blackpepper Sauce"));

        yourMeal.addNewFood(food1);
        yourMeal.addNewFood(food2);

        yourMeal.displayFoods();

        yourMeal.order(firstUser, food1, "10 February 2025");
        yourMeal.order(firstUser, food1, "15 February 2025");
        yourMeal.order(secondUser, food2, "20 February 2025");
        yourMeal.order(firstUser, food2, "26 February 2025");

        System.out.printf("Order count: %d\n", Order.getCount());

        yourMeal.displayOrders();
    }
}
```
# Expected Output
```
Bento was successfully added to the kitchen!
Tokyo Beef Humberg was successfully added to the kitchen!
Food List:
----------------------------------------------------------------------------------------------------
Bento (470 Kcal)
Description: Bento atau dalam bahasa jepang disebut o-bento merupakan makanan bekal yang berupa nasi dan lauk pauk yang dikemas secara praktis.
Spicy Level: 1
Ingredients:
Steam Rice, Beef blackpepper, Chicken Teriyaki, Japanesse Chicken sauce, Ekado, Tori no teba, Egg Chicken roll, Coleslaw, Chili Sauce, Tomato Sauce, Mayonese
----------------------------------------------------------------------------------------------------
Tokyo Beef Humberg (683 Kcal)
Description: Tokyo Beef Hamburg merupakan makanan barat bergaya jepang
Spicy Level: 1
Ingredients:
Beef Patty, Potato Wedges, Carrot, Corn Kernel, Brocoli, Fried Egg, Tonkatsu Sauce, Blackpepper Sauce
----------------------------------------------------------------------------------------------------
Josh Ronaldo ordered Bento on 10 February 2025
Josh Ronaldo ordered Bento on 15 February 2025
Kukilo Seto ordered Tokyo Beef Humberg on 20 February 2025
Josh Ronaldo ordered Tokyo Beef Humberg on 26 February 2025
Order count: 4
Order List:
----------------------------------------------------------------------------------------------------
User: Josh Ronaldo - 0789
Food: Bento
Date: 10 February 2025
----------------------------------------------------------------------------------------------------
User: Josh Ronaldo - 0789
Food: Bento
Date: 15 February 2025
----------------------------------------------------------------------------------------------------
User: Kukilo Seto - 9083
Food: Tokyo Beef Humberg
Date: 20 February 2025
----------------------------------------------------------------------------------------------------
```
User: Josh Ronaldo - 0789
Food: Tokyo Beef Humberg
Date: 26 February 2025
----------------------------------------------------------------------------------------------------
</code>
