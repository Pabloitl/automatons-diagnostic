package main;

import static utils.Palindrome.isPalindrome;
import static utils.PhraseReader.readPhrase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String filePath = "resources/text.txt";
        Scanner in = new Scanner(System.in);

        String line = in.nextLine();
        in.close();

        System.out.println(line);

        System.out.println((isPalindrome(readPhrase(filePath)))
                ? "El contenido del archivo si es un Palindromo"
                : "El contenido del archivo no es un Palindromo");
    }
}
