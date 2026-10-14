mport java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        int experience = sc.nextInt();

        System.out.println(experience > 5 ? salary + 5000 : salary);

        sc.close();
    }
}