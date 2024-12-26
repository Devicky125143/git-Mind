package INTERVIEW;

public class printpattren {
  public static void main(String[] args) {
	 int a[]= {1,2,3,4};
	
	 for(int i=0;i<a.length;i++) {
		 for(int j=0;j<=i;j++) {
			 System.out.print(a[j]);
		 }
		  System.out.println();
	 }
		  for(int k=1;k<a.length;k++) {
			  for(int l=1;l<=k;l++) {
				  System.out.print(a[l]);
			  }
			  System.out.println();
			  
		  }
		  for(int m=2;m<a.length;m++) {
			  for(int n=2;n<=m;n++) {
				  System.out.print(a[n]);
			  }
			  System.out.println();
		  }
	 }

}
