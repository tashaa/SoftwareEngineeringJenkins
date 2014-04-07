import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Testing {
	
	private HelloWorld h;
	 @Before
	   public void setUp() throws Exception 
	   {
	      h = new HelloWorld();
	   }

	@Test
	   public void testHelloEmpty() 
	   {
	      assertEquals(h.getName(),"");
	      assertEquals(h.getMessage(),"Hello!");
	   }

}
