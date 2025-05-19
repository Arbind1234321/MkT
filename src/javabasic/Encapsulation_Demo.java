package javabasic;

public class Encapsulation_Demo {

	private int age = 10;
	private String Name = "Arbind";

	public void setName(String name) {
		this.Name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return Name;
	}

	public int getAge() {
		return age;
	}

	void display() {
		System.out.println(getAge());
		System.out.println(getName());

	}

	public static void main(String[] args) {

		Encapsulation_Demo d = new Encapsulation_Demo();
		d.setAge(30);
		d.setName("Arbind kumar");
		d.display(); 

	}
}
