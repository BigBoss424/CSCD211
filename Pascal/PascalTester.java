/* Created by: Aaron Jones
 * Date: 1/22/2014
 * Description: A way to find the patterns of a Pascal Triangle using not 
 * a Pascal Triangle object but rather recursion. (Yes this is my second quarter
 * in this class.) While looking up the description of the Pascal Triangle on 
 * wikipedia; http://en.wikipedia.org/wiki/Pascal's_triangle. I saw the formula
 * that it was based upon and the first thing that popped in my mind was recursion. 
 * So I solved the equation using recursive means. Hope you don't mind. 
 */
public class PascalTester {

	public static void main(String[] args) {
		
		System.out.println("\n Pascal Triangle: ");
		
		int row = 17;
		int[][] pascalTriangle = new int[row][row];
		int x = 1;
		pascalTriangle[1][1] = 1;
      
		System.out.print("\t     " + pascalTriangle[1][1] + "\n");
		
		for(int n = 2; n < row; n++)
		{
			x = n;
			while(x<row-1)
			{
				System.out.print(" ");
				x++;
			}
			for(int k = 1; k < row; k++)
			{
				/*
				 * Wikipedia gave me the answer recursively. Much more efficient than
				 * having to create the pascal triangle according to the formula given on 
				 * this link: http://en.wikipedia.org/wiki/Pascal's_triangle;
				 * 
				 * When 
				 * (n) = (n-1) + (n-1)
				 * (k) = (k-1) + (k)
				 */
				pascalTriangle[n][k] = pascalTriangle[n-1][k-1] + pascalTriangle[n-1][k];
				if(pascalTriangle[n][k] > 0)
				{
					System.out.print(pascalTriangle[n][k] + " ");
				}
			}
			System.out.println();
		}

	}

}
