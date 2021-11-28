package week1.day1;

public class FibonacciSeries {
	int range=8;
	int fno=0;
	int sno=1;
	public void calc() {
    System.out.println(fno);
    System.out.println(sno);
    for (int i=2;i<8;i++)
    {
    	int sum=fno+sno;
    	System.out.println(sum);
    	fno=sno;
    	sno=sum;    	
    }
	}
	
	public static void main(String[] args) {
		FibonacciSeries note=new FibonacciSeries();
		note.calc();
	}

}
