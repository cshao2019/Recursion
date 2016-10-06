/**
*This method prints the integers from
*0 to n both inclusive, on separate lines
*using recursion (you can elaborate more on how you use recursion)
*@param n the largest integer printed on the screen
*@author Christine Shao
*/

public class Recursion
{
	/**
	*This method is the main argument
	*Calls the recursive method
	*@param args Call other methods
	*/
	public static void main(String[] args)
	{
		int var = 5;
		printNum(var);

	}	
	
	/**
	*This method performs the recursion
	*It prints the parameter on separate lines until 0 
	*Recurses through by decrementing by one each time
	*@param n largest integer. Use this integer to perform recursion
	**/
	public static void printNum(int n)
		{
			System.out.println(n);
			n--;
			if (n >= 0)
				printNum(n);
		
		}


}
