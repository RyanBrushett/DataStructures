import java.util.Random;

public class DListTester
{
	public static void main (String[] args)
	{
      System.out.println(  "Please see source code to explain " + 
                           "what each line is doing.");

		//Creates new deque
		DList num = new DList();
		Random rand = new Random();
		
		//testing adds
		num.addFirst(1);
		num.addLast(22);
		num.addFirst(17);
		num.addLast(33);
		num.addFirst(99);
		System.out.println(num.toString());
		
		//testing removeFirst
		num.removeFirst();
		System.out.println(num.toString());
		
		//testing removeLast
		num.removeLast();
		System.out.println(num.toString());
		
		//testing remove all
		num.removeAll();
		System.out.println(num.toString());
		
		//playing with the order
		//Even numbers first, odd after.
		int length = rand.nextInt(20);
		for (int i = 0; i <= length; i++)
		{
			if (i % 2 == 0)
				num.addFirst(i);
			else
				num.addLast(i);
		}
		System.out.println(num.toString());
		
		//removeAll again.
		num.removeAll();
		System.out.println(num.toString());
		
		//Testing removeLast when an element is added with addFirst()
		num.addFirst(3);
		int value = num.removeLast();
		System.out.println("Testing removeLast(). Expect 3: " + value);
		System.out.println("Current contents after removeLast(): " + num.toString());
		
		//Testing the properties of removeLast addFirst for order reversing.
		//Works easy peasy.
		//Clears out and reverses the order of num into a new Deque num2.
		length = rand.nextInt(12);
		for (int i = 0; i <= length; i++)
		{
			num.addFirst(rand.nextInt(200));
		}
		System.out.println("num: " + num.toString());
		DList num2 = new DList();
		for (int i = 0; i <= length; i++)
		{
			num2.addFirst(num.removeFirst());
		}
		System.out.println("num2.addFirst(num.removeFirst());: " + num2.toString());
		System.out.println("num after previous line: " + num.toString());
		
		//Testing the exception handling
		System.out.println("Testing num.removeFirst(); Num is empty. THIS SHOULD THROW AN EXCEPTION: ");
		System.out.println(num.size() + " " + num.isEmpty());
		num.removeFirst();
	}
}
