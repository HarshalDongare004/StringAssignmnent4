package in.ineuron.controller;
import java.util.*;

public class Q_6_Pangram {

    public static boolean isPangram(String str) {
        // Create a boolean array to store the presence of each letter
        boolean[] present = new boolean[26];

        // Iterate through the string and mark the presence of each letter
        for (char ch : str.toCharArray()) {
            present[ch - 'a'] = true;
        }

        // Check if all the letters are present
        for (boolean b : present) {
            if (!b) {
                return false;
            }
        }

        // The string is a pangram if all the letters are present
        return true;
    }

    public static void main(String[] args) {

        // Get the string from the user
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        // Check if the string is a pangram
        boolean isPangram = isPangram(str);

        if (isPangram) {
            System.out.println("The string is a pangram");
        } else {
            System.out.println("The string is not a pangram");
        }
    }
}