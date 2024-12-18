
import java.util.*;

public class Lab202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number : ");
        int num = sc.nextInt();
        int lastNum = num - 1;
        while (num > lastNum) {
            lastNum = num;
            System.out.print("Input number : ");
            num = sc.nextInt();
        }
        System.out.println("\nBYE BYE");

        sc.close();
    }
}