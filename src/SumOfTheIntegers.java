import java.util.Scanner;

/** SumOfTheIntegers.java
 */

public class SumOfTheIntegers {

   public static int findSum(int a, int b){

      if (a==b+1)                  // if a follows b // basic case
         return a+b;
      else                         // reduced problem: (a-1)=b+1 ('a-1' is closer to b than a)
         return a+findSum(a-1,b);  // general solution
   }

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.print("Please enter a value for the first integer: ");
      int int1 = input.nextInt();

      System.out.print("Please enter a value for the second integer: ");
      int int2 = input.nextInt();
      while (int2==int1){
         System.out.print("The second integer cannot be equal to the first one. Please enter another value: ");
         int2 = input.nextInt();
      }
      if (int1>int2)
         System.out.print("The sum of the integers from " +int1 +" to "+int2 +" ("+int1+" > "+int2+") is "+findSum(int1,int2));

      else
         System.out.print("The sum of the integers from " +int2 +" to "+int1 +" ("+int2+" > "+int1+") is "+findSum(int2,int1));

   }
}
