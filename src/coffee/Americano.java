package coffee;

public class Americano extends Beverage {
	
	public Americano(){
		description = "Americano";
	}
	
	@Override
	public double cost() {
		return 0.99;
	}
}
