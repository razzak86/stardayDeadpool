package com.upskill.java_3;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		//Array store multiple data using index
		
		int age = 30;
		int[]ageDeadpool =new int[]{25,21,35,30,40};
		
		//Array index                    [0]  [1] [2] [3] [4] 
		
		System.out.println("student Age: " + ageDeadpool[1]);
		System.out.println("Total student : "  + ageDeadpool.length);
		
		
		String[] nameDeadpool =new String[] {"masud","Tahin","zman","Razzak","Taju","Shamme"};
		
	System.out.println("student name: " + ageDeadpool[1]);
	System.out.println("Total student name : "  + ageDeadpool.length);

	//nameCity
	String[] nameCity =new String[] {"New york","Bloomfield","maryland","Sylhet","Dhaka","Tokyo"};
	
	System.out.println("City name: " + nameCity[3]);
	System.out.println("Total City: "  + nameCity.length);


	//Multi-Dimentional Array
	int[][]ageUpskill2D ={{25,21,35,30,40},
			{21,25,22,26}};
	
			
	System.out.println("Student Age 2D : " + ageUpskill2D[0][3]);

}
}



















