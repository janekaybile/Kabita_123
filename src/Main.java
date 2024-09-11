//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
class Num
{
    public static void main (String args[])
    {
        int a,b,c,sum=0;
        System.out.println("Enter a 3 number for addition:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sum=a+b+c;
        System.out.println("The sum of three numbers are="+sum);
    }
}