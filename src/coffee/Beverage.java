package coffee;

public abstract class Beverage {
	
	protected String description;
	
	public String getDescription(){
		return description;
	}
	
	public double cost(){
		return 0.0;
	}
}
