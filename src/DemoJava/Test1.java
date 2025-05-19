package DemoJava;

import java.util.ArrayList;
import java.util.function.Consumer;

class Student{
	String name;
	int id;
	Student(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public  String toString()
	{
		return this.name+"  "+this.id;
	}
	public  void display() {
		System.out.println(this.name+"  "+this.name);
	}
}


public class Test1 {

	public static void main(String[] args) {
		
		Student s=new Student("Arbind", 100);
		Student s1=new Student("Arbind", 100);
		Student s2=new Student("Arbind", 100);
		Student s3=new Student("Arbind", 100);
		ArrayList< Student> l=new ArrayList<>();
		l.add(s);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		System.out.println(l);
		
		
		Consumer<Student> c=i->{
			System.out.println(i.name+" "+i.id);
		};
		l.stream().forEach(System.out::println );
	
	}

}
