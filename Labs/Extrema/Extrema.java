import java.util;

public class Extrema
{

	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Time to find the Extrema");
		//f(x) = 2x^3 - 8x^2 + x + 16
		
		int x;
		
		System.out.println("Please enter the value for x: ");
		x = nextInt();
		
		int pFormula = 2 * Math.pow(x,3) - 8 * Math.pow(x,2) + x + 16;
		int nFormula = -1 * 2 * Math.pow(x,3) - 8 * Math.pow(x,2) + x + 16;
		
		System.out.println("High" + pFormula);
		System.out.println("Low" + nFormula);
		
	}
	
	public static int
	
	

}