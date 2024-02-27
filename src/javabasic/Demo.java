package javabasic;

public class Demo {
	int age;
	String name;
    int Empid;
    

public Demo(int age, String name, int empid) {
		
		this.age = age;
		this.name = name;
		this.Empid = empid;
	}
void display() {
	
	System.out.println(age);
	System.out.println(name);
	System.out.println(Empid);
}


//public static void main(String[] args)
//{
//
//    Demo d=new Demo(25,"Arbind",8);
//    Demo d1=new Demo(25,"sai",8);
//   //
//   // d.display();
//    System.out.println(d instanceof Demo);
//    
//}
}


