/*
   Wrote this a few years ago in a data structures class
   as practice. Helped me figure out how a stack works
   when implemented with an array.
   Helped me study a bit. Nothing special.
 */

import java.util.Random;
import java.util.Scanner;

public class StackTest
{
	public static void main (String[] args)
	{
		Random rand = new Random();
      Scanner input = new Scanner(System.in);
		ArrayStack<Integer> stack = new ArrayStack<Integer>();
      boolean done = false;
      while (!done)
      {
         System.out.print("Please type an integer: ");
         stack.push(input.nextInt());
         System.out.print("Would you like to add more? : ");
         String response = input.next();
         if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y"))
            done = false;
         else
            break;
      }
      System.out.println(stack.toString());

      System.out.println("How about we try popping a value or two?");
      boolean finished = false;
      while (!finished)
      {
         System.out.print("Pop? : ");
         String response = input.next();
         if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y"))
            System.out.println(stack.pop() + " popped off.");
         else
            break;
      }
      System.out.println(stack.toString());

      stack.status();
      System.out.println(stack.top() + " is the top element in the stack");

      System.out.println("This has been fun!");
	}
}
