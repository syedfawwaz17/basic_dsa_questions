import java.util.*;
public class Fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

       int n1 = 0,n2 = 1;
        System.out.println(n1 + " "+ n2 + " ");
       for(int i = 2;i<n;i++){
           int n3 = n2 + n1;
           n1 = n2;
           n2 = n3;
           System.out.print(n3 + " ");
       }


    }
}
