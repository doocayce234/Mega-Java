import java.util.Scanner;
public class Stat{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String string1 = "This is a Goalie Stats Calculator";
        String string2 = "Please Enter How Many Shots The Goalie Faced: ";
        String string3 = "Please Enter How Many Goals Where Let In: ";
        int p = 0;
        int y = 0;
        
        try
        {
            int Shots = 0;
            int GoalsLetIn = 0;
            for(int o = 0; o < string1.length() + string2.length() + string3.length(); o = o + 1)
        {
            if(o < string1.length())
            {
                System.out.print(string1.charAt(o));
            }
            else if(o < string1.length() + string2.length() && o > string1.length())
            {
                p = p + 1;
                if(p == 1)
                {
                    System.out.println("");
                }
                System.out.print(string2.charAt(o - string1.length() - 1));
                if(o == (string1.length() + string2.length() - 1))
                {
                    Shots = input.nextInt();
                }
            }
            else if(o < string1.length() + string2.length() + string3.length() && o > string1.length() + string2.length())
            {
                System.out.print(string3.charAt(o - (string1.length() + string2.length()) - 1));
                if(o == string1.length() + string2.length() + string3.length() - 1)
                {
                    GoalsLetIn = input.nextInt();
                }
            }
            Thread.sleep(20);
        }
        double result = Math.floor((((double) Shots - GoalsLetIn) / (double) Shots) * 1000) / 1000.0;
        System.out.println(String.format("The Goalies Save Percentage Is: %.3f.", result));
        }
        catch (Exception ex)
        {
            System.out.println("Error");
        }
        
    }
}
