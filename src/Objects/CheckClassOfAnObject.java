package Objects;
class Test{}

public class CheckClassOfAnObject {

	public static void main(String[] args) {
		Test obj=new Test();
		CheckClassOfAnObject obj1=new CheckClassOfAnObject();
		System.out.println("the class of object obj is :"+obj.getClass());
		System.out.println("the class of object obj1 is :"+obj1.getClass());
		if(obj instanceof Test)
		{
			System.out.println("obj is an instance of Test");
		}
		else
			System.out.println("obj is not an instance of Test");
			
		
		

	}

}
