/*Write an overloaded method - area(), one to find area of a 
rectangle and takes its length and width as parameter and the other 
one to find area of a circle, takes its radius as a parameter. 
 Area of rectangle = length*width
 Area of circle= 3.14*r*r */

public class CalculateArea {
	
	public static void area(int l,int w)
	{
		int arearect= l*w;
		System.out.println("The area of the Rectangle is "  +arearect);
	}
public static void area(double r)
{
	double areacirc=3.14*r*r;
	System.out.println("The area of the circle is " +areacirc);
}
	public static void main(String[] args) {
	area(4,5);
	area(5);

	}

}





/*Approach:
create 2 methods with diff parameteres */
