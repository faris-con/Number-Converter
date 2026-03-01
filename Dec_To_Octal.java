package Container;
import java.util.Scanner;

public class Dec_To_Octal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        String decNum = input.next();
        input.close();

        if (decNum.contains(".")) 
        {
            String[] parts = decNum.split("\\.");
            int integerPart = Integer.parseInt(parts[0]); 
            double fractionPart = Double.parseDouble("0." + parts[1]); 

            
            String octalInt = "";
            while (integerPart > 0) 
            {
                octalInt = (integerPart % 8) + octalInt;
                integerPart /= 8;
            }
            if (octalInt.isEmpty()) octalInt = "0";

            
            String octalFrac = "";
            int precision = 5;
            while (fractionPart > 0 && precision > 0) 
            {
                fractionPart *= 8;
                int intPart = (int) fractionPart;
                octalFrac += intPart;
                fractionPart -= intPart;
                precision--;
            }
            System.out.println("The octal number is : " + octalInt + "." + octalFrac);
        } 
        else 
        {
            int integerPart = Integer.parseInt(decNum);
            String octalInt = "";
            while (integerPart > 0) 
            {
                octalInt = (integerPart % 8) + octalInt;
                integerPart /= 8;
            }
            if (octalInt.isEmpty()) octalInt = "0";
            System.out.println("The octal number is : " + octalInt);
        }
    }
}

