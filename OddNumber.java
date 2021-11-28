package week1.day1;

public class OddNumber 
{
	int input=20;
	public void calc() 
		{
			for (int i=1;i<=input;i++) 
				{
				if(i%2!=0) { 
				System.out.println(i);
							}
				}				
		}
	
	public static void main(String[] args) 
		{
			OddNumber note=new OddNumber();
			note.calc();
		}

}