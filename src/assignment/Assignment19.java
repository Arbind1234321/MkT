package assignment;
//write a program for constructor overloading using 10 constructors
public class Assignment19 {
	Assignment19(){
		System.out.println("constructor 1");
	}
	Assignment19(int a){
		System.out.println("constructor 2");
	}
	Assignment19(double a){
		System.out.println("constructor 3");
	
	}
	Assignment19(String name ){
		System.out.println("constructor 4");
	}
	Assignment19(String name ,int a){
		System.out.println("constructor 5");
	}
	Assignment19(int a,String name ){
		System.out.println("constructor 6");
	}
	Assignment19(int a,String name ,double d){
		System.out.println("constructor 7");
	}
	Assignment19(int a,String name,float f ){
		System.out.println("constructor 8");
	}
	Assignment19(int a,String name ,String name1){
		System.out.println("constructor 9");
	}
	Assignment19(int a,int b){
		System.out.println("constructor 10");
	}
	public static void main(String[] args) {
		Assignment19 s=new Assignment19();
		Assignment19 s1=new Assignment19(10);
		Assignment19 s3=new Assignment19(10,"arbind");

	}

}
