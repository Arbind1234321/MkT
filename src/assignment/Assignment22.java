package assignment;

//Write a program to find Area of Circle,Triangle,Rectangle,Square,Trapizzium;
public class Assignment22 {
	static final double pi = 3.14;

	static void areaOfCircle(int r) {
		double Area = pi * r * r;
		System.out.println("Areaa of circle :" + Area);
	}

	static void areaOftringle(int b, int h) {
		double Area = .5 * b * h;
		System.out.println("Areaa of Tringle :" + Area);
	}

	static void areaOfRectangle(int l, int b) {
		double Area = l * b;
		System.out.println("Areaa of Rectangle :" + Area);
	}

	static void areaOfSqure(int s) {
		double Area = s * s;
		System.out.println("Areaa of squre :" + Area);
	}

	static void areaOfTrapizium(int s1, int s2, int h) {
		double Area = .5 * (s1 + s2) * h;
		System.out.println("Areaa of Trapizium :" + Area);
	}

	public static void main(String[] args) {
		areaOfCircle(7);
		areaOftringle(5, 7);
		areaOfRectangle(8, 9);
		areaOfSqure(6);
		areaOfTrapizium(2, 5, 8);

	}

}
