import java.util.Arrays;

//Write a method that takes an int array as a parameter and returns 
//the largest number in the array.
public class LargestNo {
public static void  method(int[] a)
{	
	Arrays.sort(a); // Arrays.sort(arrayname) to sort arrays.
	System.out.println(Arrays.toString(a));
	
	//Arrays.toString(arrayname)  - this will print the  list  of array elements in [] brackets.
	int	l=a.length;  // storing array length into var l.
	System.out.println("The index is " + (l-1)  +"for the array elements" +a[l-1]); //printing the last elemt
	//in the array as it will be the largest number.
	System.out.println("The largest number in the array is" +a[l-1]);
	}

	public static void main(String[] args) {
	int a[]= {12,3,6,10};
	method(a);
		}
}
/*Approach : Declare an array with array elemts
 sort the arrays - to arrange the arrays in a specific  order SYNTAX:Arrays.sort(arrayname) 
 store the length of the array
 pick the last index i.e length-1 to display the largest number 
 
  *i used Arrays.toString(arrayname) to display the array elemts like [4,7,9,10 ] */
