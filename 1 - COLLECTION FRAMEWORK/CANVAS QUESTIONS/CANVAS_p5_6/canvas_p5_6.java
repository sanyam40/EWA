// SANYAM 21CSU234 FS-III-A

/* P5,6 : Write a program that implements a simple spell checker using a hash table. Your spell-checker will be reading from two input files.
The first file is a dictionary "dictionary.txt". The program should read the dictionary and insert the words into a hash table.  After reading the dictionary, it will read a list of words from a second file. The goal of the spell-checker is to determine the misspelled words in the second file by looking each word up in the dictionary. The program should output each misspelled word.
--Definition of Done
-The program should read two files namely, “dictionary.txt” and “words.txt”
-It should check the misspelled words given in “words.txt” and display such words
-Use the appropriate Collection that implements the hashtable for storing items */

import java.util.*;
import java.io.*;

public class canvas_p5_6{
    public static void main(String[] args) throws FileNotFoundException {
        HashSet<String>dic=new HashSet<>();

        // READING THE TXT FILE THROUGH Scanner Class.
        File file=new File("dictionary.txt");
        Scanner sc=new Scanner(file);

        // JAB TAK TXT FILE MAI AUR CONTENT H USKO DIC MAI ADD KARTE JAO.
        while(sc.hasNext()){
            dic.add(sc.next());
        }

        File file2=new File("words.txt");
        sc=new Scanner(file2);

        System.out.println("Mispelled Words are: ");
		
        // CHECK THE MISPELLED IN BOTH THE FILE AND THEN PRINT IT
		while(sc.hasNext()) {
			String token = sc.nextLine();
			if(token.length() > 1 && !dic.contains(token.toLowerCase()))
					System.out.println(token);
		} 
    
    }
}