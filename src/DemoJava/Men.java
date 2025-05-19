package DemoJava;

public class Men {//idetification
	String name;
	//variable
	int age;
	
	double b$ank;
	
	
	
	
	String caste;
	int Weight;
	String location;
	public void walk()
	{
		System.out.println(" man walking");
		
	}
	public void eat()//function method
	{
		System.out.println(" man is eating");
		
	}
	public void sleep()
	{
		System.out.println(" man is sleeping ");
		
	}
	public void job()
	{
		System.out.println(" man is doing job");
		
		
		
	}
	public Men(String name, int age,String location)
	{
	   this.age=age;
	   this.name=name;
	   this.location=location;
	}
	
	public String toString(){
		return this.name+" "+this.age+" "+this.location;
	}
	
	
	public static void main(String[] args) {
	Men t=new Men("Arbind",101,"ban");
		
	}
	
	
	
	

}
