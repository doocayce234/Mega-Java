import java.util.Scanner;
public class Ana {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean firstLoop = true;
        boolean secondLoop = true;
        double one = 0.0;
        double two = 0.0;
        do{
            try{
                System.out.print("Enter the first number(can be a decimal): ");
                one = input.nextDouble();
                firstLoop = false;
            }catch(Exception e){
                System.out.println("Invalid Input, please try again.");
                input.nextLine();
            }
        }
        while(firstLoop);
        do{
            try{
                System.out.print("Enter the second number(can be a decimal): ");
                two = input.nextDouble();
                secondLoop = false;
            }catch(Exception e){
                System.out.println("Invalid Input, please try again.");
                input.nextLine();
            }
        }
        while(secondLoop);
        
        System.out.print("Enter the first word: ");
        String f = input.next();
        System.out.print("Enter the second word: ");
        String s = input.next();
        Calc calc = new Calc(one, two);
        System.out.println("Sum: " + calc.add());
        System.out.println("Difference: " + calc.subtract());
        System.out.println("Product: " + calc.multi());
        System.out.println("Quotient: " + calc.div());
        System.out.println("Power: " + calc.power());
        System.out.println("Absolute Difference: " + calc.abDiff());
        System.out.println("Square Root Of Sum: " + calc.suRooOfSum());
        System.out.println("Random Number: " + calc.ranBetNum());
        StringManP man = new StringManP(f, s);
        System.out.println("Combined: " + man.combined());
        System.out.println("Combined Length: " + man.getCombinedLength());
        System.out.println("First Half: " + man.firstHalf());
        System.out.println("Index Of Letter: " + man.indexFirstLetter());
        System.out.println("Swapped: " + man.swapFirstAndSecondHalf());
    }
}
