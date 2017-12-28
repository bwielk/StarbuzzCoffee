package coffee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DarkBlendTest{
	
	private DarkBlend blend;
	
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

}
