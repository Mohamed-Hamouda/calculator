package artifact1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
		protected int value1, value2;
		
		// assigning the values
		   protected void setUp(){
		      value1=1;
		      value2=2;
		   }
		   
		@Test
		public void testAddition() {
			
			double result= value1 + value2;
		      assertTrue(result == Calculator.Addition(value1, value2));
		      
		}

		@Test
		public void testSubtract() {
			
			double result= value1 - value2;
		      assertTrue(result == Calculator.Subtract(value1, value2));
		      
		}

		@Test
		public void testMultiply() {

			double result= value1 * value2;
		      assertTrue(result == Calculator.Multiply(value1, value2));

		}

}
