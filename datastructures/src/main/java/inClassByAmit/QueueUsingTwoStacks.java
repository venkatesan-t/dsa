package inClassByAmit;
import java.util.Stack;

public class QueueUsingTwoStacks {

	Stack<Integer> firstStack = new Stack<Integer>();
	Stack<Integer> secondStack = new Stack<Integer>();
	
	public void enQueue(int data)
	{
		while(!secondStack.isEmpty())
		{
			firstStack.push(secondStack.pop());
		}
		firstStack.push(data);
	}
	
	public int deQueue()
	{
		while(!firstStack.isEmpty())
		{
			secondStack.push(firstStack.pop());
		}
		return secondStack.pop();
	}
	
	public static void main(String[] args)
	{
		QueueUsingTwoStacks st = new QueueUsingTwoStacks();
		st.enQueue(1);
		st.enQueue(2);
		st.enQueue(3);
		
		System.out.println(st.deQueue());
		
		st.enQueue(4);
		st.enQueue(5);
		
		System.out.println(st.deQueue());
		System.out.println(st.deQueue());
		System.out.println(st.deQueue());
		System.out.println(st.deQueue());
	}
}
