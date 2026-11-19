import java.util.Scanner;
public class myclass {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("Enter a Company Name: ");
        String company = name.nextLine();
        System.out.println("i will randomise the letters in  '" + company + "'");
        char Cc = 'd';
        String CcC;
        int ran;
        int ran1;
        for (int num = 0; num <= company.length() - 1; num = num + 1)
        {
            
            ran = (int) (Math.random() *num) + 1;
            ran1 = ran;
            if(ran == ran1)
            Cc = company.charAt(ran);
            CcC = Cc + "";
            System.out.print(CcC);
        }

        
    }
}