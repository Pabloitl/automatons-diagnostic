package utils;

import java.io.File;
import java.util.Scanner;

public class PhraseReader {
    public static String readPhrase(String file) {
        try (Scanner in = new Scanner(new File(file))) {
            return in.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }
}
