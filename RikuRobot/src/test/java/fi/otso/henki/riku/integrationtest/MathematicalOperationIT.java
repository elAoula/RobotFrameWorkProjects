package fi.otso.henki.riku.integrationtest;

import static org.junit.Assert.*;

import org.junit.Test;

import fi.otso.henki.riku.robot.RikuRobot.MathematicalOperation;



public class MathematicalOperationIT {

	@Test
	public void test1() {
		MathematicalOperation n = new MathematicalOperation();
		int r = n.squareroot(3);
		assertEquals(9, r);
	}

	
	@Test
	public void testSquareNoEqual() {
		MathematicalOperation c = new MathematicalOperation();
		int result = c.squareroot(3);
		assertNotEquals(0, result);
		
	}
	
	
	@Test
	public void testFailingCase() {
		MathematicalOperation n = new MathematicalOperation();
		int r = n.squareroot(30);
		assertEquals(900, r);
	}
}
