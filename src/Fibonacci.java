import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();
        int first=0;
        int second=1;
        System.out.print("Fibonacci Series: ");
        for (int i=0;i<n;i++) {
            System.out.print(first+" ");
            int next=first+second;    //adding previous 2 numbers to get the third number
            first=second;
            second=next;
        }
    }
}

