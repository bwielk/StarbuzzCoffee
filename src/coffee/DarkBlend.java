package coffee;

public class DarkBlend extends Beverage {
	
	public DarkBlend(){
		description = "Dark Blend";
	}
	
	@Override
	public double cost() {
		return 0.89;
	}
}
