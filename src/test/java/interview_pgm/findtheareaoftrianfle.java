package interview_pgm;

import java.util.Scanner;

public class findtheareaoftrianfle {
   public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("enter the values ");
	  // base of the triangle 
	  System.out.println("enter the base of the triangle");
	 double base= sc.nextDouble();
	 //heaight of the triangle 
	 System.out.println("enter the height of the traingle ");
	 double height = sc.nextDouble();
	 //calculate the are of the traingle 
	 double area=(base/height)/2;
	 System.out.println("the area of the triangle is : "+area);
}
}
