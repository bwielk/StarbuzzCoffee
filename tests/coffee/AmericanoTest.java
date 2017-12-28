package coffee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AmericanoTest{
	
	private Americano americano;
	private Whip whip;
	private Soy soy;
	private FullMilk milk;

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
		whip = new Whip(americano);
		assertEquals("Americano, whip", americano.getDescription());
	}

}
