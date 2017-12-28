package coffee;

public abstract class Beverage {
	
	protected String description;
	protected SizeDecorator size;
	
	public String getDescription(){
		return description;
	}
	
	public double cost(){
		return 0.0;
	}
	
	public SizeDecorator getSize(){
		return size;
	}
	
	public void setSize(SizeDecorator sizeToSet){
		size = sizeToSet;
	}
}
