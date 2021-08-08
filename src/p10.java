import java.util.*;
public class p10 {

	public static void main(String[] args) {
//	ax^2+bx+c=0
		double a=1;
		double b=5;
		double c=6;
		double determinant=b*b-4*a*c;
		double root1,root2;
		if(determinant>0)
		{
		 root1=(-b+Math.sqrt(determinant))/2*a;
		 root2=(-b-Math.sqrt(determinant))/2*a;
		 System.out.println("roots are :"+root1+" and  "+root2);
		}
		else if(determinant==0)
		{
			root1=root2= -b/(2*a);
		}
		else
		{
			double real=-b/(2*a);
			double imaginary = Math.sqrt(-determinant) / (2 * a);
		      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
		      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
		}
		

}
}
