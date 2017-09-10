package assignment6_2;         //package declaration 

public class Demo {                //class definition 
	int age;                    //instance variable 

	public void details(int age) throws NegativeAgeException{       //method that  may throw negative age exception
	
		System.out.println("You have entered age value :" + age);
	if(age<0)
	
		throw new  NegativeAgeException(age);                          //throwing exception 
	else 
		System.out.println("You have entered right age.");
	
	}

}//class ends 
