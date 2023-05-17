package ArrayListdemo;

import java.util.ArrayList;

public class session4 {

	public static void main(String[] args) {
	// Declare ArrayList	
	ArrayList al = new 	ArrayList();//for hetrogenous
	
	//add data to arraylist
	al.add("core");
	al.add("33");
	al.add('H');
	al.add("true");
	//Print arraylist
	System.out.println(al);
// size method 
	System.out.println("Size of ArrayList:"+ al.size());
	//remove element
	//al.remove(2);
	//System.out.println("After removing h:"+al);
	System.out.println("size of arraylist:"+al.size());
	//get method - to access value \element from arraylist
	System.out.println("access element index of 3:"+al.get(3));
	//set method - use for replace value /change 
	al.set(0, "ruby");
	System.out.println("After set method:"+al);
	
	//size-to find hoe many element array list have
	System.out.println("size of array list:"+al.size());
	//insert element in array list
	al.add(3, 67);
	System.out.println("after insert method:"+al);
	//contains - to search element in array list 
	System.out.println(al.contains("rubyd"));
	System.out.println("is array list empty:"+al.isEmpty());
	}
  //clear - use for clear data 
}
