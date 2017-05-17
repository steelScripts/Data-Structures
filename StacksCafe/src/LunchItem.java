import java.lang.String;

public abstract class LunchItem {
	private String name;
	private double cost;
	private int calories;
		
	/*****Getters*******/
	public String getName() {
		return this.name;
	}
	
	public double getCost() {
		return this.cost;
	}
	
	public int getCalories() {
		return this.calories;
	}
	
	/*****Constructor****/
	public LunchItem(String name, double cost, int calories) {
		this.name = name;
		this.cost = cost;
		this.calories = calories;		
	}
	
}
