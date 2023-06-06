package in.ineuron.controller;
import java.util.*;

public class Q_3_Palindrome {

    public static void main(String[] args) {

        // Initialize the string
        String str = "2552";

        // Reverse the string
        String revStr = new StringBuilder(str).reverse().toString();

        // Check if the string is equal to its reverse
        if (str.equals(revStr)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}