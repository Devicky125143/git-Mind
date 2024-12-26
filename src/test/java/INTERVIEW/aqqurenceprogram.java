package INTERVIEW;

public class aqqurenceprogram {
   public static void main(String[] args) {
	 String s= "Atchutarao";
	   s=s.toLowerCase();
	 int totalchars=s.length();
	 //System.out.println(totalchars);
	 for(int c='a';c<'z';c++) {
	 int acount=0;
	 
	 for(int i=0;i<s.length();i++) {
		 if(s.charAt(i)==c) {
			 acount++;
		 }
	 }
	 if(acount>1) {
	 System.out.println("occur"+acount);
	 }
	 }
}
}
