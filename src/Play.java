
public class Play{
    public static void main(String[] args) {
        System.out.println("Hello");    
    
    int age = 50;

    String ageText = age>30?"Pass":"Fail";

    System.out.println("AgeText "+ageText);

    System.out.println( ageText instanceof String);

    double v1= 20.00d;
    double v2 = 80.00d;
    double sum = (v1+v2) * 100.00d;

    System.out.println("Total :"+sum);
    double remainder = sum % 40.00d;
    System.out.println(remainder);

    boolean isNoRemainder = (remainder==0)?true:false;

    System.out.println("isnoRemainder"+isNoRemainder);

    if (!isNoRemainder) {
        System.out.println("Got some remainder");
    }    

    }

}