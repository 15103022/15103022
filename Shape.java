/*3.Write a java program to create an abstract class named Shape that contains an empty method named number Of Sides ( ).
Provide three classes named Trapezoid, Triangle and Hexagon such that each one of the classes extends the class Shape. 
Each one of the classes contains only the method number Of Sides ( ) that shows the number of sides in the given geometrical figures.*/

package prime;

abstract class Shapes {
	abstract int numberOfSides();
}
class Trapezoid extends Shapes{
	private static int sides = 4;
	int numberOfSides()
	{
		return sides;
	}
	public String toString()
	{
		return "Trapezoid";
	}
}
class Triangle extends Shapes{
	private static int sides = 3;
	int numberOfSides()
	{
		return sides;
	}
	public String toString()
	{
		return "Triangle";
	}
}
class Hexagon extends Shapes{
	private static int sides = 6;
	int numberOfSides()
	{
		return sides;
	}
	public String toString()
	{
		return "Hexagon";
	}
}

public class Shape{
	public static void main(String args[]){
		Shapes shapes[] = new Shapes[4];
		Trapezoid tpz = new Trapezoid();
		Triangle tri = new Triangle();
		Hexagon hex = new Hexagon();
		shapes[0] = tpz;
		shapes[1] = tri;
		shapes[2] = hex;
		for(int i=0;i<3;i++)
		{
			System.out.println(shapes[i].toString() + " has sides : " + shapes[i].numberOfSides());
		}
	}
}

