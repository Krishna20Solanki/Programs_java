// Write a program user through input two numbers and check amicable
// number using Constructor.
// Example– 220 and 284 are Amicable Numbers.
// Divisors of 220 = 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110
// 1+2+4+5+10+11+20+22+44+55+110=284
// Divisors of 284 = 1, 2, 7, 71, 142
// 1+2+7+71+142=220
import java.util.*;
class Amicable
    {
      public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.print("enter the first number: ");
            int num1 = in.nextInt();
            System.out.print("enter the second number: ");
            int num2 = in.nextInt();
            int sum_num1 = 0, sum_num2 = 0;
            for (int i = 1; i <= num1; i++) {
                if (num1 % i == 0)
                    sum_num1 += i;
            }
            for (int i = 1; i <= num2; i++) {
                if (num2 % i == 0)
                    sum_num2 += i;
            }
            if (sum_num1 == sum_num2)
                System.out.println("These numbers are amicable.");
            else
                System.out.println("These numbers are not amicable.");
				System.out.println("\n");			
    }
}
