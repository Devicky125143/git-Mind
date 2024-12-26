package INTERVIEW;

public class LeepYear {
   public static void main(String[] args) {
	 int year=2030;
	 
	 if(year%400==0) 
	 {
		 System.out.println(year+" is leepyear");
	 }
	 else  if (year%4==0 && year!=100) 
	 {
		 System.out.println("is leep year");
	 }
	 else 
	 {
		 System.out.println("is not leep year");
	 }
}
}
