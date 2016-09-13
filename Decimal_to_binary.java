package decimal_to_binary;
import java.util.*;

public class Decimal_to_binary {
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        int c128,c64,c32,c16,c8,c4,c2,c1;
        int num;
        
        System.out.print("Please enter a number to convert to binary.");
        num = input.nextInt();
        
        if (num >= 128)
        {
            c128 = 1;
            num = num-128;
        }
        else 
        {
            c128 = 0;
        }
        
        if (num >= 64)
        {
            c64 = 1;
            num = num-64;
        }
        else
        {
            c64 = 0;
        }
        
        if (num >= 32)
        {
            c32 = 1;
            num = num-32;
        }
        else
        {
            c32 = 0;
        }
        
        if (num >=16)
        {
            c16 = 1;
            num = num-16;
        }
        else
        {
            c16 = 0;
        }
        
        if (num >= 8)
        {
            c8 = 0;
            num = num-8;
        }
        else
        {
            c8 = 0;
        }
        
        if (num >=4)
        {
            c4 = 1;
            num = num-4;
        }
        else
        {
            c4 =0;
        }
        
        if (num >=2)
        {
            c2 = 1;
            num =num -2;
        }
        else
        {
            c2 = 0;
        }
        
        if (num >= 1)
        {
            c1 = 1;
            num = num -2;
        }
        else
        {
            c1 = 0;
        }
        System.out.print(c128);
        System.out.print(c64);
        System.out.print(c32);
        System.out.print(c16);
        System.out.print(c8);
        System.out.print(c4);
        System.out.print(c2);
        System.out.print(c1);
    }
}