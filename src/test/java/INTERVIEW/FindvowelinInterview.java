package INTERVIEW;

public class FindvowelinInterview {
   public static void main(String[] args) {
	   String s="Interview@124";
	   s=s.toLowerCase();
		int vowel=0;
		int consonent=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vowel++;
			}
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
				consonent++;
			}
		}
		System.out.println(vowel);
		System.out.println(consonent);
	}
   
   
   
   }

