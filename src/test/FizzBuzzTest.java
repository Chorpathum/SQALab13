package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.FizzBuzz;

class FizzBuzzTest {
	FizzBuzz FiBu;
	
	@BeforeEach
	void setUp() {
		FiBu = new FizzBuzz() ;
	}
	@Test
	void FizzBuzzTest1() {
		
		assertEquals(1,FiBu.FizzBuzzcal(1));
	}
	/**/
	@DisplayName("input int 2")
	@Test
	void FizzBuzzTest2() {
		
		assertEquals('2',FiBu.FizzBuzzcal(2));
		
	}
	

}
