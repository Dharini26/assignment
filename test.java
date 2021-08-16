package project;
abstract class polygon{
	 abstract double getArea();
	 abstract double getPerimeter();
}
class Rectangle extends polygon 
{
    double length;
    double breadth;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    	double getArea()
    	{
        return length * breadth;
    	}
    	double getPerimeter() {
    	double res =length+breadth;
    	return 2*res;
    }
}
class Square extends polygon
{
    double side;

    Square(double side)
    {
        this.side = side;
    }

    double getArea()
    {
        return side * side;
    }
    double getPerimeter() {
    	return 4*side;
    }
}

class Circle extends polygon
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    double getArea()
    {
        return (22.0/7.0) * radius * radius;
    }
    double getPerimeter() {
    	return 6.28*radius;
    }
}
abstract class computeProp{
	 abstract void computeProperties1();
}
public class test extends computeProp{
		Rectangle r = new Rectangle(10, 4);
        Square s = new Square(7);
        Circle c = new Circle(3.5);
         
        public void computeProperties1() {
        System.out.println("Perimeter of Rectangle : " + r.getPerimeter());
        System.out.println("Area of Rectangle : " + r.getArea());
        System.out.println("Perimeter of Square : " + r.getPerimeter());
        System.out.println("Area of Square : " + s.getArea());
        System.out.println("Perimeter of Circle : " + r.getPerimeter());
        System.out.println("Area of Circle : " + c.getArea());
    System.out.println();
	}
		
    public static void main(String arg[])
    {
    	test t1 =new test();
    	t1.computeProperties1();
    	
    }


	}
