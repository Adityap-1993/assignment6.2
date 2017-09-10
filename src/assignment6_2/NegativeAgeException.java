package assignment6_2;  //package declaration

public class NegativeAgeException extends Exception {     //defining class for user-defined exception extending Exception class
	
	int age;                                                //instance variable 
	
	
	
	 NegativeAgeException(int a)                            //user-defined exception constructor
	 {
		 age=a;
	 }
	 
	 public String toString()                                   //method defining String output
	 {
		 return "NegativeAgeException[ "+age+ "]";
	 }
	 
	
	 
	

} //class ends
