package INTERVIEW;

public class occurencepgm {
   public static void main(String[] args) {
	 String s="Interview";
	 s=s.toLowerCase();
	 int totalchars = s.length();
	 System.out.println(totalchars);
	 int acount=0;
	 for(int i=0;i<totalchars;i++) {
		 if(s.charAt(i)=='w') {
			 acount++;
		 }
	 }
	 System.out.println(acount);
}
}
