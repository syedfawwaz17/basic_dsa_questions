import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n,x=n;
        int sum=0;
        int len =0;
        while(x!=0){
            len ++;
            x=x/10;

        }

        while(temp!=0){
            int rem = temp%10;
            sum = sum +(int)Math.pow(rem,len);
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("not a Armstrong");
        }
    }
}
