package week1.day1;

public class Factorial {
	// Declare your input as 5
	int input=5;
	//Declare an integer variable fact as 1
	int fact = 1;
	private void calc() {
		// Iterate from 1 to your input (tip: using loop concept)
		for (int i=1;i<=input;i++)
		{	
			// Within the loop: Multiply fact with the iterator variable 
			//(Tip: Assign it to the 'fact' variable)
			fact=fact*i;
		}
		//End of loop. Print factorial (fact)
		System.out.println("factorial of 5 is "+fact);
	}
		
		public static void main(String[] args) {
			
			Factorial roughNote = new Factorial();
			
			roughNote.calc();		
		}

	}
