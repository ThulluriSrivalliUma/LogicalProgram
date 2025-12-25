import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int output=collectCoupons(num);
        System.out.println("Total random numbers generated to collect all distinct coupons: "+output);
    }
    public static int randomNumbers(int num){
        Random rand=new Random();
        return rand.nextInt(num);
    }
    public static int collectCoupons(int num) {
        HashSet<Integer> distinctCoupons=new HashSet<>();
        int total=0;
        while (distinctCoupons.size() < num) {
            int coupon=randomNumbers(num);
            total++;
            distinctCoupons.add(coupon);
        }
        return total;
    }
}
