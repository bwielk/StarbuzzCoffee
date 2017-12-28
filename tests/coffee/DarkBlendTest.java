package coffee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DarkBlendTest{
	
	private Beverage blend;
	
	@Before
	public void before(){
		blend = new DarkBlend();
	}
	
	@Test
	public void blendHasDescription(){
		assertEquals("Dark Blend", blend.getDescription());
	}
	
	@Test
	public void blendHasPrice(){
		assertEquals(0.89, blend.cost(), 0.1);
	}
	
	@Test
	public void blendCanHaveMilk(){
		blend = new FullMilk(blend);
		blend = new FullMilk(blend);
		assertEquals("Dark Blend, full milk, full milk", blend.getDescription());
		assertEquals(1.89, blend.cost(), 0.1);
	}
	
}
