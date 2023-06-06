package in.ineuron.controller;
import java.util.*;

public class Q_5_Anagram {

    public static boolean isAnagram(String str1, String str2) {
        // Check if the strings have the same length
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a character array for each string
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort the characters in each array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Check if the sorted characters in the arrays are equal
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        // The strings are anagrams if the sorted characters in the arrays are equal
        return true;
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        // Get the strings from the user
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the strings are anagrams
        boolean isAnagram = isAnagram(str1, str2);

        if (isAnagram) {
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams");
        }
    }
}