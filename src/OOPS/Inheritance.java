package OOPS;

public class Inheritance {

	public static void main(String[] args) {
		Developer d1=new Developer(33,"papa");
		System.out.println(d1.age);
		System.out.println(d1.name);
		d1.walk();
		d1.read();
		
		

	}

}
//class Person
//{
//	int age;
//	String name;
//	public Person(int age, String name) {
//		
//	}
//	void walk()
//	{
//		System.out.println(" is walking");
//	}
//	void read()
//	{
//		System.out.println("is reading");
//	}
//}
class Developer extends Person
{
	void walk()
	{
		System.out.println("developer "+name+" is walking");
	}
	public Developer(int age,String name)
	{
//		for inheriting parent's property we use super
		super(age,name);
	}
}