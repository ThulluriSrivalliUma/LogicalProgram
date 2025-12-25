import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        if (primeOrNot(num)) {
            System.out.println(num+" is a Prime number.");
        }
        else{
            System.out.println(num+" is not a Prime number.");
        }
    }
    public static boolean primeOrNot(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
