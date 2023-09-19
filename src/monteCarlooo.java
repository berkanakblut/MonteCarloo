import java.util.Scanner;

public class monteCarlooo {

	public static void main(String[] args) {
		System.out.println("Nokta Sayısı Giriniz: ");
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int n = sc.nextInt();	
		
		int numberInCircle = 0;
		long start = System.currentTimeMillis();
		
		
		
		for(int i= 0; i <= n; i++ )	{
			double x = Math.random();
			double y = Math.random();	
			double distance = Math.sqrt(x * x + y * y);
			if(distance <= 1);
			numberInCircle++;
			
		}
		
		long end = System.currentTimeMillis();
		long time = end - start;
		
		double myPı = 4.0 * numberInCircle / n;
		System.out.println("My pi : " + myPı);
		System.out.println("Java ıs Pı " + Math.PI);
		System.out.println("Time : " + time + "ms.");
		
	}

}
