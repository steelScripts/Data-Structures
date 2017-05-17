import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StacksCafe {
	Stack<LunchItem>meats = null,
					vegetables = null,
					desserts = null,
					drinks = null;
	
	Queue<Order> orders = null;
	
	/*****Getter*****/
	public Stack<LunchItem> getMeats() {
		if(meats == null) {
			meats.push(new FoodItem("Alfredo", 5.50, 770));
			meats.push(new FoodItem("Ham Sandwich", 3.50, 400));
			meats.push(new FoodItem("Turkey Sandwich", 3.50, 370));
			meats.push(new FoodItem("Cornbeef Sandwich", 3.75, 420));
			meats.push(new FoodItem("Pastrami Sandwich", 3.75, 430));
			meats.push(new FoodItem("Clam Chowder", 5.00, 650));
			meats.push(new FoodItem("Chicken Noodle", 5.25, 500));
			meats.push(new FoodItem("Delux Parm", 7.00, 800));
			meats.push(new FoodItem("Special", 4.00, 400));
			meats.push(new FoodItem("Pot Pie", 6.75, 750));
		}
		return meats;
	}
	
	public Stack<LunchItem> getVegetables() {
		if(vegetables == null) {
			vegetables.push(new FoodItem("Ceasar Salad", 5.50, 770));
			vegetables.push(new FoodItem("Cranberry Salad", 3.50, 400));
			vegetables.push(new FoodItem("Veggie Sandwich", 3.50, 370));
			vegetables.push(new FoodItem("Steamed Veggies", 3.75, 420));
			vegetables.push(new FoodItem("Lentle Soup", 3.75, 430));
			vegetables.push(new FoodItem("Tofu Soup", 5.00, 650));
			
		}
		return vegetables;
	}
	
	public Stack<LunchItem> getDesserts() {
		if(desserts == null) {
			desserts.push(new FoodItem("Carrot Cake", 4.50, 770));
			desserts.push(new FoodItem("Cheese Cake", 4.50, 400));
			desserts.push(new FoodItem("Banana Pudding", 3.50, 370));
			desserts.push(new FoodItem("Chocolate Cookie", 1.75, 420));
			desserts.push(new FoodItem("Raisin Cookie", 1.75, 430));			
			
		}
		return desserts;
	}
	
	public Stack<LunchItem> getDrinks() {
		if(drinks == null) {
			drinks.push(new DrinkItem("Water", 5.50, 770));
			drinks.push(new DrinkItem("Cold Tea", 3.50, 400));
			drinks.push(new DrinkItem("White Tea", 3.50, 370));
			drinks.push(new DrinkItem("Green Tea", 3.75, 420));
			drinks.push(new DrinkItem("Cafe Mocha", 3.75, 430));
			drinks.push(new DrinkItem("Dark Roast", 5.00, 650));
			drinks.push(new DrinkItem("Espresso", 5.25, 500));
			drinks.push(new DrinkItem("Coca", 7.00, 800));
			drinks.push(new DrinkItem("Decaf", 4.00, 400));
			drinks.push(new DrinkItem("House Blend", 6.75, 750));
		}
		return drinks;
	}
	
	public LinkedList<LunchItem> getOrder() {
		if(orders == null) {
			orders = new LinkedList();
			orders.add(new Order(1));
			orders.add(new Order(2));
			orders.add(new Order(3));
			orders.add(new Order(4));
			orders.add(new Order(5));
			orders.add(new Order(6));
			orders.add(new Order(7));
			orders.add(new Order(8));
			orders.add(new Order(9));
			orders.add(new Order(10));
			
		}
		return orders.;
	}
}
