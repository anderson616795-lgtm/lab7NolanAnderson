import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int numOfTerms = 0;
    int termA = 0;
    int termB = 1;

        System.out.println("Please enter how many terms you want to print");
        numOfTerms = scan.nextInt();

        System.out.println("Fibonacci Series up to " + numOfTerms + " terms:");

        for (int i = 1; i <= numOfTerms; i++) {
        System.out.print(termA + " ");

int nextTerm = termA + termB;

termA = termB;
termB = nextTerm;
        }
    }
}