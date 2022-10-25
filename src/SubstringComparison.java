
//Lexicographical Order



import java.util.ArrayList;
import java.util.Scanner;

public class SubstringComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.next();
        int k = scanner.nextInt();

        //create substring array
        ArrayList<String> sortedArray  = new ArrayList<>();
        String first="";
        String last = "";

        for (int j = 0; j <input.length() ; j++) {
            if((j+k)>input.length())
                break;

            sortedArray.add(input.substring(j,j+k));
        }
  //      System.out.println(sortedArray);

        first=sortedArray.get(0);
        last = sortedArray.get(0);
        for (int i = 0; i <sortedArray.size() ; i++) {
            if ( first.compareTo(sortedArray.get(i) ) >0)
                first=sortedArray.get(i);

            if ( last.compareTo(sortedArray.get(i) ) <0)
                last=sortedArray.get(i);

        }

        System.out.println(first);
        System.out.println(last);
        scanner.close();
    }
}
