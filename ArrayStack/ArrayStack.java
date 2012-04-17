/*
   Wrote this a few years ago in a data structures class
   as practice. Helped me figure out how a stack works
   when implemented with an array.
   Helped me study a bit. Nothing special.
 */


public class ArrayStack<E> implements StackInterface<E>
{
	public static final int CAPACITY = 1000;
	protected E S[];
	protected int capacity;
	protected int top = -1;
	
	public ArrayStack()
	{
		this(CAPACITY);
	}
	
   @SuppressWarnings("unchecked")
	public ArrayStack(int cap)
	{
		capacity = cap;
		S = (E[]) new Object[capacity];
	}
	
	public int size()
	{
		return (top + 1);
	}
	
	public boolean isEmpty()
	{
		return (top < 0);
	}
	
	public void push(E element) throws FullStackException
	{
		if (size() == capacity)
			throw new FullStackException("Stack is full.");
		S[++top] = element;
	}
	
	public E top() throws EmptyStackException
	{
		if (isEmpty())
			throw new EmptyStackException("Stack is empty.");
		return S[top];
	}
	
	public E pop() throws EmptyStackException
	{
		E element;
		if (isEmpty())
			throw new EmptyStackException("Stack is empty.");
		element = S[top];
		S[top--] = null;
		return element;
	}
	
	public String toString()
	{
		String s;
		s = "Bottom -> [";
		if (size() > 0)
			s+= S[0];
		if (size() > 1)
			for (int i = 1; i <= size() - 1; i++)
			{
				s += ", " + S[i];
			}
		return s + "] <- Top";
	}
	
	public void status ()
	{
		System.out.print("result: size = " + size() + ", isEmpty = " + isEmpty());
		System.out.println(", stack: " + this);
	}
}
