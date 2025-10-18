import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String rev = "";
        for(int i = a.length()-1; i>=0;i--){
            rev = rev + a.charAt(i);
        }
        if(rev.equals(a))
            System.out.println("Pallindrome");
        else
            System.out.println("Not pallindrome");
    }
}
