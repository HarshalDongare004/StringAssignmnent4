package in.ineuron.controller;
import java.util.*;

public class Q_2_PrintDuplicates {

    public static void main(String[] args) {

        // Initialize the string
        String str = "geeksforgeeks";

        // Create a set to store the unique characters
        Set<Character> set = new HashSet<>();

        // Iterate through the string and add the characters to the set
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        // Create a new string to store the duplicate characters
        String duplicateStr = "";
        for (char ch : set) {
            int count = 0;
            for (char ch1 : str.toCharArray()) {
                if (ch == ch1) {
                    count++;
                }
            }
            if (count > 1) {
                duplicateStr += ch;
            }
        }

        // Print the duplicate characters
        System.out.println("Duplicate characters in the string: " + duplicateStr);
    }
}