// 3 Write a program user through input one number and perform Factorial.
// Using Constructor.

import java.util.*;
class Factorial
{
     public static void main(String []args)
     {
        
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int i=1,fact=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of the number: "+fact);  
     }   
}