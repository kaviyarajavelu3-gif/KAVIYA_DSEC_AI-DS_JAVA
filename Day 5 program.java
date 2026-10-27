1)
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}


2)
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
         for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum=sum+i;
            }
        } 
        if (sum == n) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a perfect number");
        }
    }
}
      
3)
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n,sum = 0;
         while (temp>0) {
            int digit=temp % 10;
                sum=sum+digit * digit*digit;
                 temp=temp/10;
         }           
        if (sum == n) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not a Armstrong number");
        }
    }
}

4)
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n,sum = 0;
         while (temp>0) {
            int digit=temp % 10;
             int square=digit*digit;
                sum=sum+square;
                 temp=temp/10;
         }           
            System.out.println(sum);
        
        }
    }


5)
public class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

