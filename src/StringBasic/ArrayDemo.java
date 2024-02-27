package StringBasic;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		String str="Arbind";
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));

	}

}
