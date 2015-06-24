public class exercise2qns2 {
	/*/
	 * Mohamed Ilham MA314 Exercise 2 Question 2
	 */

	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int x = 1;
		int y = 0;
		int z = 0;
		int w = 1;

		while (b > 0)
		{
			int t = a % b; // a mod b
			int u = a/b;
			int r = x;
			int s = y;
			a = b;
			b = t;
			x = z;
			y = w;
			z = r - u*z;
			w = s - u*w;

		}
		System.out.print("GCD of " + args[0] + " and " + args[1] );
		System.out.println(" = ("+x+") + ("+y + ") = " + a);

}

}
