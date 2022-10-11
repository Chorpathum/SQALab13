package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFizz {

	@Test
	void test() {
		FizzBuzz FiBu = new FizzBuzz() ;
		
		assertEquals(1,FiBu.FizzBuzzcal(1));
	}

}
