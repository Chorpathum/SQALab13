package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.FizzBuzz;

class FizzBuzzTest {

	@Test
	void FizzBuzzTest1() {
		FizzBuzz FiBu = new FizzBuzz() ;
		assertEquals(1,FiBu.FizzBuzzcal(1));
	}

}
