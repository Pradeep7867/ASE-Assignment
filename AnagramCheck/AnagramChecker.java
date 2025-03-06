import java.util.Scanner;

public class AnagramChecker {
    public static boolean isAnagram(String str1, String str2) {
        
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

      
        if (str1.length() != str2.length()) {
            return false;
        }

        // Creating a frequency array of size 26 (for 'a' to 'z')
        int[] charCount = new int[26];

        // Count character occurrences
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;  // Increment for str1
            charCount[str2.charAt(i) - 'a']--;  // Decrement for str2
        }

        // If all values in charCount are 0, it's an anagram
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Fast Anagram Checker!");
        System.out.print("Enter the first string: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String word2 = scanner.nextLine();

        if (isAnagram(word1, word2)) {
            System.out.println("'" + word1 + "' and '" + word2 + "' are anagrams.");
        } else {
            System.out.println("'" + word1 + "' and '" + word2 + "' are NOT anagrams.");
        }

        scanner.close();
    }
}

// Time & Space Complexity
// Time Complexity: O(N) (Single pass through both strings).
// Space Complexity: O(1) (Fixed array size, no extra space usage).

//The Question Is Not Much Clear About the Problem Constraints So I Hope I have meet all the exoectation 
//Yes If the String Consist Of case-insensitive anagrams that include special characters, numbers, and Unicode characters. We Can Further USE HashMAp for it .. Which leads to 