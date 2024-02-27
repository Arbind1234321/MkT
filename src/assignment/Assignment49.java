package assignment;
//In a string "sky is 441 !@#" find out the number of special character,alphabet,numeric,spaces we have
public class Assignment49 {
	public static void main(String[] args) {
		String str = "sky is 441 !@#";
		int ansc = 0;
		int spec = 0;
		int alpc = 0;
		int l=str.length();
		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			boolean ans = Character.isDigit(ch[i]);
			boolean spe = Character.isSpace(ch[i]);
			boolean alp = Character.isAlphabetic(ch[i]);
			
			if (ans) {
				ansc++;
			}
			if (spe) {
				spec++;
			}
			if (alp) {
				alpc++;
			}
		}
		int spc=l-(ansc+spec+alpc);
		System.out.println("Total spaces : "+spec);
		System.out.println("Total Digit : "+ansc);
		System.out.println("Total alphabet : "+alpc);
		System.out.println("Total special character : "+spc);

	}

}
