import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        a = a.toUpperCase();
        b = b.toUpperCase();

        char[] aList =a.toCharArray();
        char[] bList =b.toCharArray();

        if(a.length()!=b.length()) {
            System.out.println("Not Anagrams");
            System.exit(0);
        }
        Arrays.sort(aList);
        Arrays.sort(bList);

        if(Arrays.compare(aList,bList)==0){
            System.out.println( "Anagrams");
        }else{
            System.out.println( "Not Anagrams");
        }
    }
}