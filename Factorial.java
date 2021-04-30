
public class Factorial {
	public static int calculo(int n)
	{
		if (n<0)
		{
			throw new IllegalArgumentException ("Numero "+n+ "no puede ser negativo");
		}
		int fact=1;
		for (int i=2;i<=n;i++)
		{
			fact*=i;
		}
		if (fact<0)
		{
			throw new ArithmeticException ("Overflow, Numero "+n+" demasiado grande "); 
		}
	return fact;
	}
	
	
	
	
	
	
}
