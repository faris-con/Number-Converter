package Container;
import java.util.Scanner;
public class Hex_To_Dec
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number:");
        String hexa = input.nextLine().toUpperCase().trim();
        
        if (hexa.contains(".")) 
        {
            String[] parts = hexa.split("\\."); 
            if (parts.length != 2) 
            {
                System.out.println("Error: Invalid hexadecimal format.");
                return;
            }

            String integerPart = parts[0];
            String fractionPart = parts[1];
            int sum = 0;
            for (int i = 0; i < integerPart.length(); i++) 
            {
                char x = integerPart.charAt(i);
                if (Character.isDigit(x)) 
                {
                    sum += (x - '0') * Math.pow(16, integerPart.length() - i - 1);
                } 
                else if (x >= 'A' && x <= 'F') 
                {
                    sum += (x - 'A' + 10) * Math.pow(16, integerPart.length() - i - 1);
                }
                else 
                {
                    System.out.println("Incorrect character.");
                    return;
                }
            }

            double sum1 = 0;
            for (int i = 0; i < fractionPart.length(); i++) 
            { 
                char x = fractionPart.charAt(i);
                if (Character.isDigit(x)) 
                {
                    sum1 += (x - '0') * Math.pow(16, -i - 1);
                } 
                else if (x >= 'A' && x <= 'F') 
                {
                    sum1 += (x - 'A' + 10) * Math.pow(16, -i - 1);
                } 
                else 
                {
                    System.out.println("Incorrect character.");
                    return;
                }
            }

            System.out.println("The decimal number is: " + (sum + sum1));

        } 
        else 
        {
            int sum = 0;
            for (int i = 0; i < hexa.length(); i++) 
            {
                char x = hexa.charAt(i);
                if (Character.isDigit(x)) 
                {
                    sum += (x - '0') * Math.pow(16, hexa.length() - i - 1);
                } 
                else 
                {
                    if(x >= 'A' && x <= 'F') 
                    {
                    sum += (x - 'A' + 10) * Math.pow(16, hexa.length() - i - 1);
                    }
                    else 
                    {
                    System.out.println("Incorrect character.");
                    return;
                    }
                }    
            }
            System.out.println("The decimal number is: " + sum);
        }
    }
}