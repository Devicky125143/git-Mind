package INTERVIEW;

public class StringRevWordType {
  public static void main(String[] args) {
	 String s=" I love my country";
	 String rev="";
	 String[]str=s.split(" ");
	 for(int i=0;i<str.length;i++) {
		 char ch[]=str[i].toCharArray();
		 for(int j=ch.length-1;j>=0;j--) {
			 rev=rev+ch[j];
		 }
		 rev=rev+" ";
		 
	 }
	 System.out.println(rev);
	 
}
}
