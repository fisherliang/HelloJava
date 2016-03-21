package greetings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import printing.BWCartridge;
import printing.Printer;

public class HelloJava {

	public static void main(String[] args)
	{
		
		Printer<BWCartridge> printer = new Printer<BWCartridge>(true, "My Printer", new BWCartridge());
		
		Map<String, List<Integer>> testScores = new HashMap<String, List<Integer>>();
		List<Integer> FisherScores = new ArrayList<Integer>();
		
		FisherScores.add(80);
		FisherScores.add(50);
		FisherScores.add(90);
		FisherScores.add(88);
		
		testScores.put("Fisher", FisherScores);
		
		List<Integer> JulieScores = new ArrayList<Integer>();
		
		JulieScores.add(80);
		JulieScores.add(90);
		JulieScores.add(98);
		
		testScores.put("Julie", JulieScores);
		
		List<Integer> AllenScores = new ArrayList<Integer>();
		
		AllenScores.add(40);
		AllenScores.add(50);
	
		testScores.put("Allen", AllenScores);
		
		printScores("Fisher", testScores);
	}	
	
		public static void printScores(String studentName, Map<String, List<Integer>> scoreMap)
		{
			List<Integer> scores = scoreMap.get(studentName);
			for(int score : scores)
				System.out.println(score);
		}
		
}
