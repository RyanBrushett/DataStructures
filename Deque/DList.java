public class DList
{
	protected int size;
	protected DNode header, trailer;
	
	/*
	Constructor for empty Deque.
	Creates a header and trailer node that, for now,
	point to each other due to the list being empty.
	The size of the list = 0 so size = 0 (duh!)
	*/
	public DList()
	{
		size = 0;
		header = new DNode();
		trailer = new DNode();
		header.setNext(trailer);
		trailer.setNext(header);
	}
	
	//Returns size;
	public int size()
	{
		return size;
	}
	
	//Returns true if size == 0; false otherwise.
	public boolean isEmpty()
	{
		return (size == 0);
	}
	
	//returns the data at the first node
	public int getFirst() throws EmptyListException
	{
		if (isEmpty()) throw new EmptyListException("List is empty");
		return header.getNext().getElement();
	}
	
	//returns the data at the last node
	public int getLast() throws EmptyListException
	{
		if (isEmpty()) throw new EmptyListException("List is empty");
		return trailer.getPrev().getElement();
	}
	
	//adds a node at the beginning.
	public void addFirst(int num)
	{
		DNode second = header.getNext();
		DNode first = new DNode(num, header, second);
		second.setPrev(first);
		header.setNext(first);
		size++;
	}
	
	//adds a node at the end.
	public void addLast(int num)
	{
		DNode secondLast = trailer.getPrev();
		DNode last = new DNode(num, secondLast, trailer);
		secondLast.setNext(last);
		trailer.setPrev(last);
		size++;
	}
	
	//returns the data at the first node and removes it from the list.
	public int removeFirst() throws EmptyListException
	{
		if (isEmpty())
			throw new EmptyListException("Deque is Empty");
		DNode first = header.getNext();
		int num = first.getElement();
		DNode second = first.getNext();
		header.setNext(second);
		second.setPrev(header);
		size--;
		return num;
	}
	
	//returns the data at the last node and removes it from the list.
	public int removeLast() throws EmptyListException
	{
		if (isEmpty())
			throw new EmptyListException("Deque is empty");
		DNode last = trailer.getPrev();
		int num = last.getElement();
		DNode secondLast = last.getPrev();
		trailer.setPrev(secondLast);
		secondLast.setNext(trailer);
		size--;
		return num;
	}
	
	//Removes the list leaving the header and trailer so more can be added.
	public void removeAll()
	{
		size = 0;
		if (header.getNext().equals(trailer))
			return;
		else {
			DNode first = header.getNext();
			header.setNext(first.getNext());
			removeAll();
		}
	}
	
	//toString mostly used for testing. Useful for visualizing list.
	public String toString()
	{
		String s = "[";
		DNode v = header.getNext();
		while (v != trailer)
		{
			s += v.getElement();
			v = v.getNext();
			if (v != trailer)
				s += ", ";
		}
		s += "]";
		return s;
	}
}