package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.MathProbs;


@DisplayName("Math Problems")
class MathProbTest {

	MathProbs cal;
	
	@BeforeEach
	void init() {
		cal = new MathProbs();
		
	}
	
	@Test
	@DisplayName("return added values")
	void testAdd() {
		int expected = 2;
		
		int actual = cal.add(1, 2);
		
		assertEquals(cal.add(1, 2),2);
	}
	
	
	@Test
	@DisplayName("return subtracted values")
	void testSubtract() {
		
		int expected = 3;
		
		int actual = cal.sub(4, 1);
		
		assertEquals(cal.sub(4, 1), 3);
	}
	
	@Test
	@DisplayName("return divided values")
	void testDivide() {
		int expected = 4;
		
		int actual = cal.div(20, 5);
		
		assertEquals(cal.div(20, 5), 4);
	}
	
	@Test
	@DisplayName("return multiplied values")
	void testMultiply() {
		int expected = 4;
		
		int actual = cal.mult(2, 6);
		
		assertEquals(cal.mult(3, 5), 20);
	}
	
	@Test
	@DisplayName("return circumference value")
	void testCircumference() {
		double expected = 12.56;
		System.out.println(expected);
		double actual = cal.circumference(3.14, 4);
		System.out.println(actual);
		assertEquals(cal.circumference(3.14, 4), 12.56, "this value is correct");
	
	}
	
}
