package coffee;

public class Whip extends CondimentsDecorator{
	
	private Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", whip";
	}
	
	@Override
	public double cost(){
		return beverage.cost() + 0.4;
	}
}
