package assignment;
class Demo2{
	void add() {
		System.out.println("this is Add");
	}
}
public class Assignment31   extends Demo2{
	void sub() {
		System.out.println("this is sub");
	}

	public static void main(String[] args) {
		Assignment31 a=new Assignment31();
		a.add();
		a.sub();

	}

}
