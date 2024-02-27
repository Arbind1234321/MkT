package javabasic;
import java.util.Scanner;
public interface TestDemo1 {
	public static void main(String[] args)// 1
	{   Scanner sc = new Scanner(System.in);// 2
		// int n=sc.nextInt();//3
		int a = 5;// 4,8,12,16
		for (int i = 1; i <= 10; i++)// i
		{
			System.out.println("5*" + i + "--->" + "-" + 5 * i);
		}
	}

}
