package Container;
import java.util.Scanner;
public class Oct_To_Dec 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an octal number:");
        String octal = input.nextLine();
        if(octal.contains("."))
        {
            String[] parts = octal.split("\\.");
            String integerPart = parts[0];
            String fractionPart = parts[1];
            double sum1 = 0;
            for(int i = 0; i <integerPart.length(); i++)
            {
                char x = octal.charAt(i);
                sum1 += (x - '0') * Math.pow(8,integerPart.length() - i - 1);
            }
            double sum2 = 0;
            for(int i = 0; i < fractionPart.length(); i++)
            {
                char x = octal.charAt(i);
                sum2 += (x - '0') * Math.pow(8 , -i - 1);
            }
            System.out.println("The octal number is : " +(sum1 + sum2));
        }
        else
        {
            int total = 0;
            for(int i = 0; i < octal.length(); i++)
            {
                char x = octal.charAt(i);
                total += (x - '0') * (Math.pow(8 , octal.length() - i - 1));
            }
            System.out.println("The octal number is : " +total);
        }
    }
}
