import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        int n=num;
        int reversedNum=0;
        while (num!=0){
            int rem= num%10;
            reversedNum=(reversedNum*10)+rem;
            num=num/10;
        }
        System.out.println("Reverse of "+n+" is: "+reversedNum);
    }
}
