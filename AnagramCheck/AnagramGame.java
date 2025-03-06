
// Write a Java program that takes two strings as input and checks if they are anagrams 
// (containing the same characters in a different order).

//So First Understand this Problem 
// Anagram means two words contain the same characters but in a different order.
// #Example 1 : listen , silent  (Clearly We Can See Same Char but differ Order) - > TRUE
// #Example 2 : hellow , world    - > FALSE

// SO let's Move Forward With Brute Force Approach that is 

/*Sorting Method:
Convert both strings to character arrays.
Sort them and check if they are equal. */ 

import java.util.Arrays;
import java.util.Scanner;

public class AnagramGame {
    public static boolean isAnagram(String str1, String str2) {
        // Step 1: Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Edge Case If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) 
        {
            return false;
        }

        // Step : Convert to character arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step : Compare the sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);

      // Display game instructions
      System.out.println("Welcome to the Anagram Checker Game! 🎮");
      System.out.println("Enter two words, and I'll tell you if they are anagrams or not.");

      //  Take user input for Word 1
      System.out.print(" Enter the first word: ");
      String word1 = scanner.nextLine();

      System.out.print("Enter the second word: ");
      String word2 = scanner.nextLine();

      //  Check if they are anagrams
      if (isAnagram(word1, word2)) 
      {
          System.out.println("Woohoo! Great '" + word1 + "' and '" + word2 + "' are anagrams! ");
      } else 
      {
          System.out.println("Oops! Sorry '" + word1 + "' and '" + word2 + "' are NOT anagrams. ");
      }

      // Close the scanner
      scanner.close();
  }
}

//overall Time Complexity : O(N log N)
// And Overall Space Complexity : O(N)

// FoR Better Optimization Check the Next Program File Which AnagramChecker.java
