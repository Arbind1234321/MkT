package assignment;
//Copy the value of 1 array into another array using iteration
public class Assignment50 {

	public static void main(String[] args) 
	{
	 int arr[]= new int[4];

	 arr[0]=33;
	 arr[1]=366;
	 arr[2]=56;
	 arr[3]=10;
	 int arr1[]=new int[4];
	 for (int i = 0; i < arr.length; i++) 
	 {
		arr1[i]=arr[i];
	 }
	 for (int i = 0; i < arr.length; i++) 
	 {
		System.out.println(arr1[i]);
	 }

	}

}
