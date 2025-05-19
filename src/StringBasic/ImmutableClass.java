package StringBasic;
//final; because no one allowed to over ride these class.
public final  class ImmutableClass {
	private int i;
	public ImmutableClass(int i) {
		this.i=i;
	}
	//creating immutable object 
	public ImmutableClass modify(int i)
	{
		if(this.i==i)
		{
			return this;
		}
		else {
			return (new ImmutableClass(i));
		}
	}

	public static void main(String[] args) {
		ImmutableClass t1=new ImmutableClass(10);
		ImmutableClass t2=t1.modify(100);
		ImmutableClass t3=new ImmutableClass(10);
		System.out.println(t1==t3);

	}

}
