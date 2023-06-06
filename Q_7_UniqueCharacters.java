package in.ineuron.controller;
import java.util.HashSet;
import java.util.*;
import java.util.Set;

public class Q_7_UniqueCharacters {

    public static boolean isUnique(String str) {
        // Create a set to store the characters in the string
        Set<Character> set = new HashSet<>();

        // Iterate through the string and add the characters to the set
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        // Check if the size of the set is equal to the length of the string
        // This means that all the characters in the string are unique
        return set.size() == str.length();
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        // Get the string from the user
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        // Check if the string contains all unique characters
        boolean isUnique = isUnique(str);

        if (isUnique) {
            System.out.println("The string contains all unique characters");
        } else {
            System.out.println("The string does not contain all unique characters");
        }
    }
}