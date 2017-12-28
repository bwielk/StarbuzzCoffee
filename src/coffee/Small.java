package coffee;

public class Small extends SizeDecorator {
	
	private Beverage beverage;
	
	public Small(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return "Small " + beverage.getDescription();
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.3;
	}

}
