package Container;
import java.util.Scanner;

public class Dec_To_Hex {
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

            
            String hexInt = "";
            while (integerPart > 0) 
            {
                int remainder = integerPart % 16;
                if (remainder < 10) 
                {
                    hexInt = remainder + hexInt;
                } 
                else 
                {
                    hexInt = (char) ('A' + remainder - 10) + hexInt;
                }
                integerPart /= 16;
            }
            if (hexInt.isEmpty()) hexInt = "0";
            String hexFrac = "";
            int precision = 5;
            while (fractionPart > 0 && precision > 0) 
            {
                fractionPart *= 16;
                int intPart = (int) fractionPart;
                if (intPart < 10) 
                {
                    hexFrac += intPart;
                }
                else 
                {
                    hexFrac += (char) ('A' + intPart - 10);
                }
                fractionPart -= intPart;
                precision--;
            }
            System.out.println("The hexadecimal number is : " + hexInt + "." + hexFrac);
        } 
        else 
        {
            int integerPart = Integer.parseInt(decNum);
            String hexInt = "";
            while (integerPart > 0) 
            {
                int remainder = integerPart % 16;
                if (remainder < 10) 
                {
                    hexInt = remainder + hexInt;
                } 
                else 
                {
                    hexInt = (char) ('A' + remainder - 10) + hexInt;
                }
                integerPart /= 16;
            }
            if (hexInt.isEmpty()) hexInt = "0";
            System.out.println("The hexadecimal number is : " + hexInt);
        }
    }
}
