/*
   Wrote this a few years ago in a data structures class
   as practice. Helped me figure out how a stack works
   when implemented with an array.
   Helped me study a bit. Nothing special.

   I added the serialVersionUID recently to suppress some
   warnings and prevent any weirdness, if it would come up.
 */

public class FullStackException extends RuntimeException
{
   public static final long serialVersionUID = 1L;
	public FullStackException(String err)
	{
		super(err);
	}
}
