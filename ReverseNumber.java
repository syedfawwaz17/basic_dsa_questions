import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int left=0, rev=0, number = 0;
        while(n!=0){
            left = n%10;
            rev = rev*10 + left;
            n = n/10;
        }

        System.out.println(rev);
    }
}
