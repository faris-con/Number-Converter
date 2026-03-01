package Container;

import java.util.Scanner;

public class Dec_To_Bin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        String decNum = input.next();
        input.close();

        if (decNum.contains(".")) {
            String[] parts = decNum.split("\\.");
            int integerPart = Integer.parseInt(parts[0]);  
            double fractionPart = Double.parseDouble("0." + parts[1]); 

            
            String intBinary = "";
            while (integerPart > 0) 
            {
                intBinary = (integerPart % 2) + intBinary;
                integerPart /= 2;
            }
            if (intBinary.isEmpty()) intBinary = "0"; 
            StringBuilder fracBinary = new StringBuilder();
            int precision = 3; 
            while (fractionPart > 0 && precision > 0) 
            {
                fractionPart *= 2;
                int bit = (int) fractionPart;
                fracBinary.append(bit);
                fractionPart -= bit;
                precision--;
            }

            System.out.println("The binary number is : " + intBinary + "." + fracBinary);
        } 
        else
        {
            int integerPart = Integer.parseInt(decNum);
            String intBinary = "";
            while (integerPart > 0) 
            {
                intBinary = (integerPart % 2) + intBinary;
                integerPart /= 2;
            }
            if (intBinary.isEmpty()) intBinary = "0";
            System.out.println("The binary number is : " + intBinary);
        }
    }
}
