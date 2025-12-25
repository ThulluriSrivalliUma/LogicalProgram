import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Stop watch start time: ");
        sc.nextLine();
        Instant start=Instant.now();
        System.out.println("Stop watch start time: ");
        sc.nextLine();
        Instant end=Instant.now();
        float elapsedTime=Duration.between(start,end).toSeconds();
        System.out.println("Elapsed Time: "+elapsedTime+" sec");
    }
}
