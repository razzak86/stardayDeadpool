package com.upskill.java_2;

import com.upskill.java_1.$missing$;

public class MethodTypes {

	public static int hourlyIncome = 65;
	
	public static void main(String[] args) {
		MethodTypes obj = new MethodTypes();
		obj.annualIncome();
		
		weeklyIncome();
		
		System.out.println("My monthly Income= "+obj.monthlyIncome);
		

	}
	//void method 	
		public void annualIncom(){
			int calculateAnnualIncome = hourlyIncome*2000;
			System.out.println("My Annual Income =" + calculateAnnualIncome);
			
		}
		
		//static Method
		public static void weeklyIncome(){
			int CalculateWeeklyIncome =hourlyIncome *40;
			System.out.print("My Weekly Income =" + calculateAnnualIncome);
			
	//return type method 
	public int monthlyIncome() {
		int calculateMonthlyIncome = hourlyIncome *180;
		return calculateMonthlyIncome;
	}
	
  // Method 
	public void Razzaque(){ } 
	 String name ="razzaque";
	 int age =30;
	System.out.println(name); 		
							
		}
		
	}

}






