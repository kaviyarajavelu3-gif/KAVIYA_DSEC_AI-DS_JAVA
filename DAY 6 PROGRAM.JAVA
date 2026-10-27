1)
public class Main {
    public static void main(String[] args) {
        int a []={10,20,30,40,50};
        int n = 5;
        int pos=2;
        for (int i = pos; i < n - 1; i++)
             a[i]=a[i+1];
  n--;
for (int i=0;i<n;i++){
    System.out.println(a[i]+"");
}
}
}

2)
public class Main {
    public static void main(String[] args) {
        int a []={10,20,30,40,50};
        int key = 20;
        int pos=-1;
        for (int i = 0; i < a.length ; i++){
            if  (a[i]==key){
                pos=i;
                break;
            }
        }  
        if(pos<-1)
           System.out.println("Found at index"+pos);
        else
            System.out.println("Not found");
    }
}


3)
public class Main {
    public static void main(String[] args) {
        int a []={10,20,30,40,50,60};
        int key = 40;
        int low = 0;
        int high = a.length -1 ; 
        int pos=-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(a[mid]==key){
                pos=mid;
                break;
            }else if (key>a[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
            if (pos!=-1)
                System.out.println("Found at index"+pos);
            else
                System.out.println("Not found");
        }
    }  
}    

4)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];

        for (int i = 1; i < 5; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Largest element = " + max);
        sc.close();
    }
}

5)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        int largest = a[0];
        int second = Integer.MIN_VALUE;

        for (int i = 1; i < 5; i++) {
            if (a[i] > largest) {
                second = largest;
                largest = a[i];
            } else if (a[i] > second && a[i] < largest) {
                second = a[i];
            }
        }

        System.out.println("Largest element = " + largest);

        if (second == Integer.MIN_VALUE) {
            System.out.println("Second largest element not found");
        } else {
            System.out.println("Second largest = " + second);
        }

        sc.close();
    }
}







               









