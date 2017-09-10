package assignment6_2;

public class Main {               //main class declaration

	public static void main(String[] args) {      //main method starts
		// TODO Auto-generated method stub
		Demo d1= new Demo();                  //object creation 
	
		try {                                 //monitoring for given input 
			
			
			d1.details(-18);
			
			
		}
		catch(NegativeAgeException n)         //catching exception 
		{
			System.out.println("Caught : " +n);    //printing exception details
		}

	}

}//main class ends
