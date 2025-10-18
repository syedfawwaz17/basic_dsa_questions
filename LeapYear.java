import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%400==0)
            System.out.println("Leap year");
        else if(a%4==0 && a%100!=0)
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}
