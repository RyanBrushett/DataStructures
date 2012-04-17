/*
   Wrote this a few years ago in a data structures class
   as practice. Helped me figure out how a stack works
   when implemented with an array.
   Helped me study a bit. Nothing special.
 */

public interface StackInterface<E>
{
	public int size();
	
	public boolean isEmpty();
	
	public E top()
		throws EmptyStackException;
		
	public void push(E element)
		throws FullStackException;
	
	public E pop()
		throws EmptyStackException;
}
