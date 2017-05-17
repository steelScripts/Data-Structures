import java.lang.StringBuffer;

public class DrinkItem extends LunchItem{
	int size; //in ounces
	public DrinkItem(String name, double cost, int calories) {
		super(name, cost, calories);
		// TODO Auto-generated constructor stub
	}
	
	/***Getter***/	
	public int getSize() {
		return size;
	}
	
	
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append(getSize());
		buf.append(" ounce(s) of");
		buf.append(this.getName());
		buf.append(" - $");
		buf.append(this.getCost());
		return buf.toString();		
	}
}
