
public class CharToStringViceVersa {

	public static void main(String[] args) {
		char ch='a';
		String str= Character.toString(ch);
		System.out.println("string is :"+ str);
		String str1="ashu is my name";
		char[] chars=str1.toCharArray();
		System.out.println("converted string to char is :"+ Array.toString(chars));
		
		

	}

}
