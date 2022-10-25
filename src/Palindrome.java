import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        char arr[]=str1.toCharArray();
        String str2="";


        for (int i = arr.length-1; i >=0 ; i--) {
            str2 = str2 + arr[i];
        }
        if(str1.equals(str2))
            System.out.println("Yes");
        else
            System.out.println("No");
        //System.out.println(input);
    }
}