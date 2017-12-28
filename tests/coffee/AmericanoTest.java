package coffee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AmericanoTest{
	
	private Beverage americano;

	@Before
	public void before() {
		americano = new Americano();
	}
	
	@Test
	public void coffeeHasDescription(){
		assertEquals("Americano", americano.getDescription());
	}
	
	@Test
	public void coffeeHasPrice(){
		assertEquals(0.99, americano.cost(), 0.1);
	}
	
	@Test
	public void coffeeCanHaveWhip(){
		americano = new Whip(americano);
		assertEquals("Americano, whip", americano.getDescription());
		assertEquals(1.39, americano.cost(), 0.1);
	}
	
	@Test
	public void coffeeCanHaveDoubleWhip(){
		americano = new Whip(americano);
		americano = new Whip(americano);
		americano = new Small(americano);
		assertEquals("Small Americano, whip, whip", americano.getDescription());
		assertEquals(2.09, americano.cost(), 0.1);
	}

}
