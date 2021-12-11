/*Create a class Box with length, width, height as data members. Write three 
overloaded constructors –
1. No Arguments - initializes all members to zero.
2. One Argument (For a cube: length=width=height) – initializes all members to 
the value passed . 
3. Three Arguments for length, width, and height.
Write a method to find the volume of the box. (Volume = length*width*height).
Write a class BoxDemo with the main() method, that creates three box objects 
using the three constructors respectively, and call the method volume on all the 
three objects. */

public class Box {  // created a class named Box
private double length;  // declaring class attributes
private double width;
private double height;

public  Box(){  //Constructor for class Box is created with 0 arg's
	length=0;   //initialize the attributes inside the constructor
	width=0;
	height=0;
	}
public Box(double x) { ////Constructor for class Box is created with 1 arg
	length=x;          //initialize the attributes inside the constructor
	width=x;
	height=x;
	
}
public Box(double l1,double w1,double h1) {  ////Constructor for class Box is created with 3 arg's
	length=l1;                           //initialize the attributes inside the constructor
	width=w1;
	height=h1;
	
}
public void Volmethod() {  //method created
	double volume1=length*width*height;
	System.out.println("The Volumeof the cube is "  +volume1);
	
}

}
