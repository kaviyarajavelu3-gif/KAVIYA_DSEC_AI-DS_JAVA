1)
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ("aeiouAEIOU".indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        System.out.println("Sentence after removing vowels:");
        System.out.println(result);

        sc.close();
    }
}


2)
public class RemoveSpecialCharacters {
    public static void main(String[] args) {

        String str = "Java@123 Programming#2026!";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("After Removing Special Characters: " + sb);
    }
}

3)
import java.util.Scanner;

public class StudentNames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter student name " + i + ": ");
            String name = sc.nextLine();

            sb.append(i).append(". ").append(name).append("\n");
        }

        System.out.println("\nStudent List:");
        System.out.println(sb);

        sc.close();
    }
}

4)
import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) == ' ') {
                sb.setCharAt(i, '-');
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("After Replacing Spaces: " + sb);

        sc.close();
    }
}

