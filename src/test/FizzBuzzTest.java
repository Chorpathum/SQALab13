package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;



import main.FizzBuzz;

class FizzBuzzTest {
	FizzBuzz FiBu;
	
	@BeforeEach
	void setUp() {
		FiBu = new FizzBuzz() ;
	}
	@Test
	void FizzBuzzTest1() {
		
		assertEquals("1",FiBu.FizzBuzzcal(1));
	}
	/**/
	@DisplayName("input int 2")
	@Test
	void FizzBuzzTest2() {
		
		assertEquals("2",FiBu.FizzBuzzcal(2));
		
	}
	@DisplayName("input int 3")
	@Test
	void FizzBuzzTest3() {
		
		assertEquals("Fizz",FiBu.FizzBuzzcal(3));
		
	}
	
	@DisplayName("input int 5 output Buzz")
	@Test
	void FizzBuzzTest4() {
		
		assertEquals("Buzz",FiBu.FizzBuzzcal(5));
		
	}
	@DisplayName("input int 15 output FizzBuzz")
	@Test
	void FizzBuzzTest5() {
		
		assertEquals("FizzBuzz",FiBu.FizzBuzzcal(15));
		
	}
	@DisplayName("input int 1-100 ")
	@ParameterizedTest
	@CsvFileSource(files = "src/filetest/Num1-100.csv",numLinesToSkip = 1)
	void FizzBuzzTest6(int num, String expect) {
				
		assertEquals(expect, FiBu.FizzBuzzcal(num));
		
	}
	
	
}
