package StringBasic;

public  class Demo{
	
	String name;
	int roll;
	public Demo(String name, int roll)
	{
		this.name=name;
		this.roll=roll;
				
	}
	public  void display()
	{
		System.out.println(name+ " "+roll);
	}
	public String toString() {
        return this.name +" "+ this.roll;
    }
	

	public static void main(String[] args) 
	{
     Demo d=new Demo("arbind",10);
   
		System.out.println(d.toString());
	}
}