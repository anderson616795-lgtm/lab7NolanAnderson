import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Please enter a word: ");
        String userWord = scan.nextLine();

        boolean palindrome = true;
        int length = userWord.length();

        for (int i = 0; i < length / 2; i++) {
            String forwardLetter = userWord.substring(i, i + 1);
            String backwardLetter = userWord.substring(length - 1 - i, length - i);

            if (!forwardLetter.equalsIgnoreCase(backwardLetter)) {
                palindrome = false;
            }
        }

        if (palindrome) {
            System.out.println(userWord + " is a palindrome.");
        } else {
            System.out.println(userWord + " is not a palindrome.");
        }
    }
}