public class DNode
{
	protected int element;
	protected DNode next, prev;
	
	/*
	Constructor for a node of 0 element.
	Null previous node.
	Null next node.
	*/
	public DNode()
	{
		this(0, null, null);
	}
	/*
	Constructor for node of element int e.
	Previous node p
	next node n
	*/
	public DNode(int e, DNode p, DNode n)
	{
		element = e;
		prev = p;
		next = n;
	}
	
	//returns element.
	public int getElement()
	{
		return element;
	}
	
	//returns previous node in list.
	public DNode getPrev()
	{
		return prev;
	}
	
	//returns next node in list.
	public DNode getNext()
	{
		return next;
	}
	
	//Sets the element of the node.
	public void setElement(int e)
	{
		element = e;
	}
	
	//Set the node previous to the current node.
	public void setPrev(DNode p)
	{
		prev = p;
	}
	
	//Set next node to the current node.
	public void setNext(DNode n)
	{
		next = n;
	}
}