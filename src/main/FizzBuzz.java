package main;

public class FizzBuzz {
	 public String FizzBuzzcal(Integer input) {
		 //หาร3ลงตัว return Fizz
		 if (input%3==0) {
			 return "Fizz";
		 }
		 else {
			 return input.toString();
		 }
	 }
}
