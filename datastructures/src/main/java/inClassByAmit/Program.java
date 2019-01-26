package inClassByAmit;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinkedList queue = new QueueLinkedList();
		
		System.out.println(queue.isEmpty());
		
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
	}

}
