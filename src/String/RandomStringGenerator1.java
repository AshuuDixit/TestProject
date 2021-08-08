package String;

import java.util.Random;

public class RandomStringGenerator1 {

	public static void main(String[] args) {
		String str1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder str=new StringBuilder();
		Random random=new Random();
		int length=8;
		for(int i=0;i<length;i++)
		{
			int index=random.nextInt(str1.length());
			char randomchar=str1.charAt(index);
			str.append(randomchar);
		}
		 String randomString = str.toString();
		    System.out.println("Random String is: " + randomString);
		    

	}

}
