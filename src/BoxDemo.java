/*Write a class BoxDemo with the main() method, that creates three box objects 
using the three constructors respectively, and call the method volume on all the 
three objects. */
public class BoxDemo {

	public static void main(String[] args) {
	Box obj1=new Box();  /// creating objects for respective Constructors with respective parameters
	Box obj2=new Box(5);
	Box obj3=new Box(5.2,2,1);
obj1.Volmethod();    //calling the method thru objects

obj2.Volmethod();

obj3.Volmethod();
	}

}
