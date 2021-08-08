
public class StringIsEmptyOrNull {

	public static void main(String[] args) {
		String str1="";
		String str2=" ";
		String str3=null;
		System.out.println("string one is :"+ isEmptyNull(str1));
		System.out.println("string two is :"+ isEmptyNull(str2));
		System.out.println("string three is :"+ isEmptyNull(str3));
		
		
	
		

	}
	public static String isEmptyNull(String str)
	{
		if(str==null)
		{
			return "NULL";
			
		}
		else if(str.isEmpty())
		{
			return "Empty";
		}
		else
			return "Neither Null Nor Empty";
	}

}
