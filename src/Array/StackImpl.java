package Array;

public class StackImpl {
	private int arr[];
	private int top;
	private int size;

	StackImpl(int size) {
		this.arr = new int[size];
		this.size = size;
		this.top = -1;
	}

	public boolean isEmpty() {

		return top == -1;
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public void push(int n) {
		if (isFull()) {
			System.out.println("Stack overflows");
			System.exit(1);
		}
		arr[++top] = n;
	}

	public int peek() {
		if (!isEmpty())
			return arr[top];
		else {
			System.out.println("stack is empty");
			System.exit(1);
		}
		return -1;
	}

	public int pop() {
		if (!isEmpty()) {
			int num = arr[top];
			arr[top] = 0;
			top--;
			return num;
		} else {
			System.out.println("Stack underflow");
			System.exit(1);

		}
		return -1;

	}

	public int size() {
		return top + 1;
	}

	public static void main(String[] args) {

		StackImpl stack = new StackImpl(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.peek());
		stack.push(4);
		stack.push(5);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		stack.push(8);
		System.out.println(stack.peek());

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
