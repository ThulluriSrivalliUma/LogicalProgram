import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        num=sc.nextInt();
        for (int i=1;i<=num/2;i++){
            if (num%i==0){
                sum+=i;
                System.out.println(i);
            }
        }
        if (sum==num) {
            System.out.println(num+" is a Perfect Number.");
        }
        else {
            System.out.println(num+" is not a Perfect Number.");
        }
    }
}