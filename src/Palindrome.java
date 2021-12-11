/*Write a method that takes a String as a parameter and returns true 
if String is palindrome else return false. ( A string is a palindrome if 
it is same as its reverse. Eg. mom, refer). */

/*Using String.charAt() method:
Get the string and the index
Get the specific character using String.charAt(index) method.
Return the specific character. */
public class Palindrome {

	public	static void Palin (String str)
		{
		
		System.out.println(str.length());
		String reversestr="";  // declare this variable w/o spaces between "".if u give space it takes as space before Mom!=Mom
		//so throws error
		//The loop runs from the end to the beginning of the string.
		
		for(int i=(str.length()-1);i>=0;--i)// len=2 so charAt(2)=M 
			// len=1;charAt(1)=O  and len=0 charAt(0)=M
			reversestr=reversestr+str.charAt(i); // M O M
		if (str.toLowerCase().equals(reversestr.toLowerCase()))
		{
			System.out.println("Its a Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		}
		
		
	public static void main(String[] args)
	{
		Palin("MOM");
	}
	
	}

/* Approach: store string in a variable
declare reverse string variable
reverse string and store it in a variable
compare orginal string with reverse string 

 The charAt() method accesses each character of the string.
 The toLowerCase() method converts both str and reverseStr to lowercase. 
 This is because Java is case sensitive and 'M' and 'n' are two different values.*/