package INTERVIEW;

public class findtheconvowel {
  public static void main(String[] args) {
	 String s="atchutarao@123";
	 int total = s.length();
	 System.out.println(total);
	 
	 int vowel=0;
	 int cons=0;
	 int other=0;
	 
	 for(int i=0;i<total;i++) {
		 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			 vowel++;
		 }
		 else if(s.charAt(i)>'a'&& s.charAt(i)<'z') {
			 cons++;
		 }
		 else {
			 other++;
		 }
	 }
	 System.out.println(vowel);
	 System.out.println(cons);
    System.out.println(other);
  
  }
}
