import java.util.*;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String rev = "";
        for(int i =a.length()-1; i>=0;i--){
            rev = rev + a.charAt(i);
        }
        System.out.println("Reversed String : "+rev);
    }
}
