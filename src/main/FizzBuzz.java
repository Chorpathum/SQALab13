package main;

public class FizzBuzz {
	 public String FizzBuzzcal(Integer input) {
		 //หาร3ลงตัว return Fizz
		 if (input%3==0) {
			 return "Fizz";
		 }
		 else if (input%5==0){
			 return "Buzz";
		 }
		 else {
			 return input.toString();
		 }
	 }
}
