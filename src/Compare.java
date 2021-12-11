/*Write an overloaded method that takes two parameters and return 
if they have equal value or not. For eg, if you pass two Strings, the 
method should return true if the Strings are equal else false. If you 
pass two integers, the method should return if they are equal else 
false. */
public class Compare {

	public static boolean methodequal(int a,int b)
	{
		if(a==b)
			return true;
		else 
			return false;
		
	}
	public static boolean methodequal(String x,String y)
	{
		if(x==y)
			return true;
			else
				return false;
	}
	public static void main(String[] args) {
		boolean s=methodequal(5,5);
System.out.println("The passed 2 integers are equal " +s);
		boolean t=methodequal("sofi","xyz");
		System.out.println("The passed 2 Strings are equal " +t);

	}

	
}