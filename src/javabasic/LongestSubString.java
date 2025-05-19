package javabasic;
import java.util.HashSet;
import java.util.Set;
public class LongestSubString {
	public static void main(String[] args) {
		String s = "abcdabcb";
		int end = 0;
		int start = 0;
		int max_length = 0;
		Set<Character> set = new HashSet<>();
		//Approach 1
//		while (end < s.length()) {
//			char c = s.charAt(end);
//			if (!set.contains(c))//
//			{
//				set.add(c);// abc
//				end++;
//				max_length = Math.max(max_length, set.size());
//
//			} else {
//				char t = s.charAt(start);
//				set.remove(t);// a
//				start++;
//			}
//		}
		while(end<s.length())
		{
			if(!set.contains(Character.valueOf(s.charAt(end))))
			{
				//set.add(Character.valueOf(s.charAt(end)));
				set.add(s.charAt(end));
				end++;
				max_length=Math.max(set.size(), max_length);
			}
			else
			{
				System.out.println(set);
				set.remove(s.charAt(start));
				start++;
			}
		}
		System.out.println(max_length);
	}
}
