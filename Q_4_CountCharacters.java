package in.ineuron.controller;
import java.util.*;

public class Q_4_CountCharacters {

    public static void main(String[] args) {

        // Initialize the string
        String str = "This is a really simple sentence";

        // Initialize the counters
        int vowelCount = 0;
        int consonantCount = 0;
        int specialCharacterCount = 0;

        // Iterate through the string and count the characters
        for (char ch : str.toCharArray()) {

            // Check if the character is a vowel
            if (isVowel(ch)) {
                vowelCount++;
            }

            // Check if the character is a consonant
            else if (isConsonant(ch)) {
                consonantCount++;
            }

            // Check if the character is a special character
            else {
                specialCharacterCount++;
            }
        }

        // Print the counts
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of special characters: " + specialCharacterCount);
    }

    private static boolean isVowel(char ch) {

        // A vowel is a character that is a letter and in the following set: a, e, i, o, u
        return ch >= 'a' && ch <= 'u';
    }

    private static boolean isConsonant(char ch) {

        // A consonant is a character that is a letter and not a vowel
        return !isVowel(ch);
    }
}