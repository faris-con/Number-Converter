package Container;
import java.util.Scanner;
public class Bin_To_Dec 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an binary number:");
        String binary = input.nextLine();
        if(binary.contains("."))
        {
            String[] parts = binary.split("\\.");
            String integerPart = parts[0];
            String fractionPart = parts[1];
            double sum1 = 0;
            for(int i = 0; i <integerPart.length(); i++)
            {
                char x = binary.charAt(i);
                sum1 += (x - '0') * Math.pow(2,integerPart.length() - i - 1);
            }
            double sum2 = 0;
            for(int i = 0; i < fractionPart.length(); i++)
            {
                char x = binary.charAt(i);
                sum2 += (x - '0') * Math.pow(2 , -i - 1);
            }
            System.out.println("The octal number is : " +(sum1 + sum2));
        }
        else
        {
            int total = 0;
            for(int i = 0; i < binary.length(); i++)
            {
                char x = binary.charAt(i);
                total += (x - '0') * (Math.pow(2 , binary.length() - i - 1));
            }
            System.out.println("The octal number is : " +total);
        }
    }
}
