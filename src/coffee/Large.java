package coffee;

public class Large extends SizeDecorator {
	
	private Beverage beverage;
	
	public Large(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return "Large " + beverage.getDescription();
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.7;
	}

}
