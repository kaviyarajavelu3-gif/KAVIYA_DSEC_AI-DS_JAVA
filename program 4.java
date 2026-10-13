import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String result = (n > 0) ? "Positive" :
                        (n < 0) ? "Negative" : "Zero";

        System.out.println(result);
    }
}