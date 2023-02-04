
 public class polymorphism extends MethodType{

	public static void main(String[] args) {

	car ();	
	car (1000);
	car ("moon");
	
	}
	
	public static void car(){
		System.out.println("My car isAudi !");
		
	}
public static void car(int hp){
	System.out.println("My car is hummer !" + "It has engine:" +hp);	
}
public static void car(String roof){
	System.out.println("My car is BMW !" +"It has roof:" + roof);
}
	public static void car(int bettery,String motor){
		System.out.println("My car is TESLA !" +"It has bettery:" + bettery +" It has Motor: " + motor);	
	
}
	}




