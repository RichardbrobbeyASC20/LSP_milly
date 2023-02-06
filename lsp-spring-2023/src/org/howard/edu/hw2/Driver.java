//Richard Brobbey
package org.howard.edu.hw2;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.HashMap;

public class Driver {

	public static void main(String[] args) {
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(new File("src/main/resources/words.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open resource");
			System.exit(1);
		}
		HashMap<String, Integer> wordCounts = new HashMap<>();
		while(fileScanner.hasNextLine())
		{
			String line = fileScanner.nextLine();
			String[] words = line.split("\\s+");
			for (String word : words)
			{
				word = word.toLowerCase();
				
				if(wordCounts.containsKey(word))
				{
					if(word.length() > 3) {
					int count = wordCounts.get(word);
					wordCounts.put(word, count + 1);
					}
				}
				else
				{
					if(word.length() > 3)
					{
					wordCounts.put(word, 1);
					}
				}
			}
		}
		fileScanner.close();
		
		for (String word : wordCounts.keySet())
		{
			System.out.println(word + ": " + wordCounts.get(word));
		}
	}
}