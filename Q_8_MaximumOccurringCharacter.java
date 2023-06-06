package in.ineuron.controller;
import java.util.*;

public class Q_8_MaximumOccurringCharacter {

    public static void main(String[] args) {

        // Get the string from the user
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        // Create a character array to store the characters in the string
        char[] arr = str.toCharArray();

        // Create a map to store the frequency of each character
        HashMap<Character, Integer> map = new HashMap<>();

        // Iterate through the character array and add the characters to the map
        for (char ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find the maximum occurring character
        int max = -1;
        char maxChar = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        // Print the maximum occurring character
        System.out.println("The maximum occurring character in the string is: " + maxChar);
    }
}