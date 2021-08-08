
public class QuadraticRoot {

	public static void main(String[] args) {
	float a=12.2f;
	float b=45.0f;
	float c=15.0f;
	double root1=0,root2=0;
	double determinant=b*b-4*a*c;
	if(determinant>0)
	{
		 root1=(-b+Math.sqrt(determinant))/(2*a);
		 root2=(-b-Math.sqrt(determinant))/(2*a);
		 System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
	}
	else if(determinant != 0) {
	
		double real = -b / (2 * a);
		double imaginary = Math.sqrt(-determinant) / (2 * a);
		System.out.format("root1 = %.2f+%.2fi", real, imaginary);
	      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
	} 
	else {
		root1=root2=-b/2*a;
		 System.out.format("root1 = root2 = %.2f;", root1);
	}
	

	}

}
