package INTERVIEW;

public class findthe {
public static void main(String[] args) {
	String s="atchutarao";
	int total = s.length();
	System.out.println(total);
	
	int acount = 0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a') {
			acount++;
		}
		
	}
	System.out.println(acount);
}
}
