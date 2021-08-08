public class Compi {

	public static void main(String[] args) {
		String[] str={"Today", "is", "a","Nice", "Day"};
		
		int num=41;
	
		int first=num%10;
			int second=num/10;
			
			String str6=str[second-1];
			String str2=str[first-1];
			int str7=str6.length();
			int str8=str7/2;
			for(int k=1;k<=str8;k++)
			{
		   System.out.print(str6.charAt(str8-k));
			}
			for(int k=0;k<str8;k++)
			{
		   System.out.print(str6.charAt(str8+k));
			}
			System.out.print(" ");
			int str3=str2.length();
			int str4=str3/2;

			  for(int j=0;j<=str4;j++)
			{
		   System.out.print(str2.charAt(str4-j));
			}
			
			for(int l=0;l<=str4;l++)
			{
		   System.out.print(str2.charAt(str4+l));
			}
			
	}

}
