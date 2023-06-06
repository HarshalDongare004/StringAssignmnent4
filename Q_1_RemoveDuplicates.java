package in.ineuron.controller;
import java.util.*;

public class Q_1_RemoveDuplicates {

    public static void main(String[] args) {

        // Initialize the string
        String str = "geeksforgeeks";

        // Create a set to store the unique characters
        Set<Character> set = new HashSet<>();

        // Iterate through the string and add the characters to the set
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        // Create a new string to store the unique characters
        String newStr = "";
        for (char ch : set) {
            newStr += ch;
        }

        // Print the new string without duplicates
        System.out.println("String without duplicates: " + newStr);
    }
}