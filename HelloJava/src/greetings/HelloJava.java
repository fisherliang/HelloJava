package greetings;

import java.util.HashSet;
import java.util.Set;

import printing.BWCartridge;
import printing.Printer;

public class HelloJava {

	public static void main(String[] args)
	{
		
		Printer<BWCartridge> printer = new Printer<BWCartridge>(true, "My Printer", new BWCartridge());
		
		Set<Integer> mySet = new HashSet<Integer>();
		
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		mySet.add(1);
		
		// Set doesn't have duplicates, so the result is 3
		System.out.println(mySet.size());
	}

}
