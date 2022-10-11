package main;

public class FizzBuzz {
	 public String FizzBuzzcal(Integer input) {
		 //หาร3ลงตัว หาร5ลงตัว return FizzBuzz
		 if (input%3==0 && input%5==0){
			 return "FizzBuzz";
		 }
		 //หาร5ลงตัว return Buzz
		 else if (input%5==0){
			 return "Buzz";
		 }
		 //หาร3ลงตัว return Fizz
		 else if (input%3==0) {
			 return "Fizz";
		 }
		 else {
			 return input.toString();
		 }
	 }
}
