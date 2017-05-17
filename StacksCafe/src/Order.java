import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Order<LunchItem> extends ArrayList<LunchItem>{

	public int orderNumber;
	
	void fillOrders(){
		StacksCafe cafe = new StacksCafe();
		LinkedList<LunchItem> orders = (LinkedList<LunchItem>) cafe.getOrder();
		while(!cafe.getMeats().isEmpty() && !cafe.getDesserts().isEmpty() &&
				!cafe.getVegetables().isEmpty() &&  !cafe.getDrinks().isEmpty()){
			for(int i = 0; i < 10; i++) {
				orders.set(i, cafe.getMeats().get(i)); cafe.getVegetables().get(i),
						cafe.getDesserts().get(i), cafe.getDrinks().get(i));
			}
		}
			
	}
	void checkoutOrders(){}
	
	public Order(int num) {
		this.orderNumber = num;
	}
	
	public double calculateTotalCost() {
		double total = 0;
		for(LunchItem l : this)
		{
			LunchItem temp = l;
			double cost = ((LunchItem) temp).getCost();
			total += cost;
		}
		return total;
	}
	
	public String toString() {
		int counter = 0;
		StringBuffer buf = new StringBuffer();
		
		buf.append("Order: #");
		buf.append(this.orderNumber);
		for(LunchItem l : this) {
			buf.append("\n\t");
			buf.append(l.toString());
		}
		buf.append("\nTotal: $");
		buf.append(calculateTotalCost());
		buf.append("\n");
		counter++;
				
		return buf.toString();
		
	}
	
}
