package coffee;

public class Medium extends SizeDecorator {
	
	private Beverage beverage;
	
	public Medium(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return "Medium " + beverage.getDescription();
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.5;
	}

}
