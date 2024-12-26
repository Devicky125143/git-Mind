package INTERVIEW;

public class consonentsprint {

	 public static void main(String[] args) {
			String s= "atchutarao@124";
		
			int consonent=0;
			int vowel=0;
			int other=0;
			
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
					vowel++;
				}
				else if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
					consonent++;
			}
				else  {
				   //remaing charectors print
					other++;
				}
			}
			System.out.println(vowel);
			System.out.println(consonent);
			System.out.println(other);		
		}
		}


