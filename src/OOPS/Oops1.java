package OOPS;

public class Oops1 {
	
		public static void main(String[] args) {
		Person p1=new Person();
		p1.age=21;
		p1.name="ASHU";
		
//		Person() is default constructor
		Person p2=new Person();
		
//		parameterized constructor
		Person p3=new Person(21,"mummy");
		
		p2.age=11;
		p2.name="AYUSH";
		System.out.println("age of person 1 is :"+p1.age); 
		System.out.println("name of person 1 is :"+p1.name);
		System.out.println("age of person 2 is : "+p2.age);
		System.out.println("name of person 2 is : "+p2.name);
		p1.walk();
		p2.read();
		p1.read();
		p2.walk();
		p1.walk(4);
		System.out.println(Person.count);
		p3.walk();
		p3.read();
		System.out.println(p3.age);
		System.out.println(p3.name);
	
		
		}
}

// class other than main class
class Person
{
	String name;
	int age;
	//static means property is for  whole class not only object
	 static int count;
	 
//	default constructor
	public Person()
	{
		count++;
//		System.out.println("constructor is created");
	}
	
//	constructor overloading
	public Person(int newAge, String newName)
	{
////		to class different constructor from another constructor
		this();
		
		age=newAge;
		name=newName;
	}
	
//	same as above code
	
//	public Person(int age, String name)
//	{
////		to class different constructor from another constructor
//		this();
//		this.name=name;
//		this.age=age;
//		
//	}
	
//	behaviour of class person
//	polymorphism concept
	
	void read()
	{
		System.out.println(name+" "+" is reading");
	}
	void walk()
	{
		System.out.println(name+" is walking");
	}
	void walk(int steps)
	{
		System.out.println(name+" has walked "+ steps+" steps" );
	}
}



