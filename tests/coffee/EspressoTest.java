package coffee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EspressoTest{

	private Espresso espresso;
	
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

}
