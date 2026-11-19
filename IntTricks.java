import java.util.Scanner;
import java.lang.StringBuilder;
public class IntTricks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean inputLoop = true;
        int num = 0;
        do{
            try{
                System.out.println("Please enter a Integer: ");
                num = input.nextInt();
                inputLoop = false;
            }
            catch(Exception e){
                System.out.println("Invalid Input, please try again.");
                input.next();
                inputLoop = true;
            }
        }
        while(inputLoop);
        System.out.println("Sum: " + IntTricks.sumNum(num));
        System.out.println("Number reversed: " + IntTricks.rev(num));
        System.out.println("Factors: " + IntTricks.factors(num));
        System.out.println("Is Palindrome: " + IntTricks.isPalindrome(num));
        input.close();
    }
    public static int sumNum(int num) {
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
    public static int rev(int num) {
        String rev = "";
        int REV = 0;
        while(num > 0){
            rev += num % 10;
            num = num / 10;
        }
        REV = Integer.parseInt(rev);
        return REV;
    }
    public static boolean isPalindrome(int num) {
        String Num = Integer.toString(Math.abs(num));
        String rev = new StringBuilder(Num).reverse().toString();
        return Num.equals(rev);
    }
    public static String factors(int num) {
        String factors = "";
        for(int i = 1; i <= num; i =i + 1){
            if(num % i == 0){
                factors += i + " ";
            }
        }
        return factors;
    }
}