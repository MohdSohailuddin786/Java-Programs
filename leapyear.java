import java.util.*;
public class leapyear {
    public static void main(String args[])
    {
        int yr;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year");
        yr=sc.nextInt();
        if(yr%4==0)
        {
            if(yr%100==0)
            {
                if(yr%400==0)
                {
                    System.out.println("leap year");
                }
                else
                System.out.println("not a leap");
            }
            else
             System.out.println(" leap year");
        }
        else
        {
            System.out.println("not a leapp");
        }
    }
    
}
