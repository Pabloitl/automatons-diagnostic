package utils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        Stack<Character> seen = new Stack<>();

        s = Arrays.stream(s.toLowerCase().split("\\s"))
            .collect(Collectors.joining());

        for (int i = 0; i < s.length() / 2; ++i)
            seen.push(s.charAt(i));

        for (int i = s.length() / 2 - 1; i >= 0; --i) {
            if (seen.empty()) return false;
            if (s.charAt(s.length() - i - 1) == seen.top())
                seen.pop();
        }

        return seen.empty();
    }
}
