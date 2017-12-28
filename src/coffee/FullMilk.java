package coffee;

public class FullMilk extends CondimentsDecorator{
	
	private Beverage beverage;

	public FullMilk(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", full milk";
	}
	
	@Override
	public double cost(){
		return beverage.cost() + 0.5;
	}

}
