package upskill;

public abstract class AbstractClass {

	
	//public class has both abstract method and regular method 
	public void car(){
		System.out.println("My car is Audi !"); 
	}	
		//Abstract method dosen't have any implementation 
	   public abstract void iDoor(); 
	   
	 //Abstract method dosen't have any implementation 
	   public abstract void iBus(); 
	   
	   // Regular Method 
	   public int truck(){
		   return 5; 
	   }
	   
	   //Abstract method dosen't have any implementation 
	   public String bus (){
		   return "School Bus"; 
	   }
	 //Abstract method dosen't have any implementation 
	   public abstract  String iBus(); 
		 	   	          
}


