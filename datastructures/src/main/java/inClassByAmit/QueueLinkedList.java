package inClassByAmit;

public class QueueLinkedList {
	public Node front;
	public Node rear;
	public Node prev;

	public QueueLinkedList()
	{
		front = null;
		rear = null;
	}
	
	public void enQueue(int data)
	{
		Node prevRear = rear;
		rear = new Node();
		rear.data = data;
		rear.next = null;		
		if(isEmpty())
		{
			front = rear;
		}
		else
		{
			prevRear.next = rear;
		}
	}
	
	public int deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		int data = front.data;
		front = front.next;
		if(isEmpty())
		{
			rear = null;
		}
		return data;
	}
	
	public boolean isEmpty()
	{
		return rear == null && front == null;
	}
}
