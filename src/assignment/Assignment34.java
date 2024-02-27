package assignment;
class Demo1{
	Demo1(){
		System.out.println("paent of Demo1");
	}
}
public class Assignment34 extends Demo1 {
	Assignment34()
	{
		super();
		System.out.println("child");
	}
	public static void main(String[] args) {
	  Assignment34 a=new Assignment34();
	  System.out.println("this is main mertho");
     
	}

}

