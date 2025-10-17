import java.util.*;
public class StringAnagram {
    public static boolean isAnagram(String str1 , String str2){
        str1 = str1.replaceAll("\\s+","").toLowerCase();
        str2 = str2.replaceAll("\\s+","").toLowerCase();
        if(str1.length()!=str2.length())
            return  false;
        int count[] = new int[256];
        for(int i = 0;i<str1.length();i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for(int c : count){
            if(c!=0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();

        if (isAnagram(s1,s2))
            System.out.println("Strings are Anagrams");
        else
            System.out.println(" Strings are NOT Anagrams");

    }
}
