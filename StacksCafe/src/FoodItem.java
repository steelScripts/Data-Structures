import java.lang.String;

public class FoodItem extends LunchItem {
	String unit; //piece, slice, bowl, ect.
	
	/***Gets***/
	
	/***Constructor***/
	public FoodItem(String name, double cost, int calories) {
		super(name, cost, calories);
		// TODO Auto-generated constructor stub
	}
	
	/***To String***/
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append(this.unit);
		buf.append(" ");
		buf.append(this.getName());
		buf.append(" (");
		buf.append(this.getCalories());
		buf.append(") - $");
		buf.append(this.getCost());
		buf.append("\n");
		return buf.toString();		
	}
	

}
