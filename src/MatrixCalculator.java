
public class MatrixCalculator {


	public static void main (String[] args) {
		int a[][]={{1,0,2},{-1,3,1}};    
		int b[][]={{3,1},{2,1},{1,0}};    
		int c;
		int d;
		int e;
		int f;
		

		c =a[0][0]*b[0][0]+a[0][1]*b[1][0]+a[0][2]*b[2][0];
		d =a[0][0]*b[0][1]+a[0][1]*b[1][1]+a[0][2]*b[2][1];
		e =a[1][0]*b[0][0]+a[1][1]*b[1][0]+a[1][2]*b[2][0];
		f =a[1][0]*b[0][1]+a[1][1]*b[1][1]+a[1][2]*b[2][1];      
		System.out.print(c);
		System.out.println(d);
		System.out.print(e);  	
		System.out.println(f);	
	
	
	}
}
