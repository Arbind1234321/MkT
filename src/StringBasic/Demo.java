package StringBasic;
import java.util.Scanner;
public class Demo {
	int a;
	int b;
	Scanner sc;
	{
		System.out.println("Enter no");
		sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
	}
	static void add() {
		Demo d1 = new Demo();
		d1.Su();

		System.out.println(d1.a + d1.b);
	}
	void Su() {
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		add();
		System.out.println(d.a);

	}

}
