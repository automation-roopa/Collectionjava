package ArrayListdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class session5 {

	public static void main(String[] args) {
	//declare array list
		ArrayList <String>al= new ArrayList<String> (); 
		al.add("k");
		al.add("R");
		al.add("I");
		al.add("S");
		al.add("H");
		al.add("A");
		al.add("N");
		
		//System.out.println(al);
		ArrayList <String>al2= new ArrayList<String> ();
		System.out.println("Befor adding:"+al2);
		al2.addAll(al);
		System.out.println("After adding:"+al2);
		al2.removeAll(al2);
		System.out.println(al2);
		
		for(int i = 0;i<al.size();i++)
			
		{
			System.out.println(al.get(i));
		}
		/*for (String i:al)
		{
			System.out.println(i);
		}*/
		   Iterator it =al.iterator();
		   while(it.hasNext())
		   {
			   System.out.println(it.next());
		   }
	}


    

}
