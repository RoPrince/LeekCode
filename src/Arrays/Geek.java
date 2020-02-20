package Arrays;// Java program to illustrate
// Overriding only hashCode() method 

import java.util.HashMap;
import java.util.Map;

class Geek 
{ 
	String name; 
	int id; 
	
	Geek(String name, int id) 
	{ 
		this.name = name; 
		this.id = id; 
	} 
	
	@Override
	public int hashCode() 
	{ 
		
		// We are returning the Geek_id 
		// as a hashcode value. 
		// we can also return some 
		// other calculated value or may 
		// be memory address of the 
		// Object on which it is invoked. 
		// it depends on how you implement 
		// hashCode() method. 
		return this.id; 
	} 
	
} 

class GFG 
{ 
	public static void main (String[] args) 
	{ 
		
		// creating two Objects with 
		// same state 
		Geek g1 = new Geek("aditya", 6);
		Geek g2 = new Geek("aditya", 6);
		
		Map<Geek, String> map = new HashMap<Geek, String>(); 
		map.put(g1, "CSE"); 
		map.put(g2, "IT"); 
		
		for(Geek geek : map.keySet()) 
		{ 
			System.out.println(map.get(geek).toString()); 
		} 

	} 
} 
