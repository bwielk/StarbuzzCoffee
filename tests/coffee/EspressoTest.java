package coffee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EspressoTest{

	private Beverage espresso;
	
	@Before
	public void before(){
		espresso = new Espresso();
	}
	
	@Test
	public void espressoHasDescription() {
		assertEquals("Espresso", espresso.getDescription());
	}
	
	@Test
	public void espressoHasCost(){
		assertEquals(1.99, espresso.cost(), 0.1);
	}
	
	@Test
	public void espressoCanHaveSoyMilk(){
		espresso = new Soy(espresso);
		espresso = new Soy(espresso);
		assertEquals(2.39, espresso.cost(), 0.1);
		assertEquals("Espresso, soy, soy", espresso.getDescription());
	}

}
