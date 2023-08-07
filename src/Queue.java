
public class Queue {
	private int num[];
	private int front, rear, capacity, currentSize;
	
	public Queue() {
		capacity = 5;
		currentSize = 0;
		num = new int[capacity];
		front = -1;
		rear = -1;
	}
	
	public Queue(int capacity) {
		this.capacity = capacity;
		currentSize = 0;
		num = new int[this.capacity];
		front = -1;
		rear = -1;
	}
	
	public boolean isEmpty() {
		return front == -1;
	}
	
	public boolean isFull() {
		return front == 0 && rear == capacity-1;
	}
	
	public void enqueue(int data) {
		if (isFull()) {
			System.err.println("Queue is full");
		} else {
			if (rear == -1) {
				front =0;
				rear = 0;
				num[rear] = data;
			} else if ( rear+1 < capacity) {
				num[++rear] = data;
			}
			currentSize++;
		}
	}
	
	public int dequeue() {
		int val = 0;
		if (isEmpty()) {
			System.err.println("Queue is empty");
		} else {
			currentSize--;
			val = num[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front++;
			}
		}
		return val;
	}
	
	public String display() {
		String hold = "";
		if (!isEmpty()) {
			for (int i = front; i <= rear; i++) {
				hold+=num[i] + " ";
			}
		} else {
			hold = "Queue is empty!";
		}
		return hold;
	}
	
	public int frontValue() {
		return num[front];
	}
	
	public int rearValue() {
		return num[rear];
	}
	
	public int peek() {
		if(isEmpty()) {
			System.err.println("Queue is empty");
			return -1;
		} else {
			return num[front];
		}
	}
	
	public int last() {
		if(isEmpty()) {
			System.err.println("Queue is empty");
			return -1;
		} else {
			return num[rear];
		}
	}
	
	public int getCurrentSize() {
		return currentSize;
	}
	
	public int getCapacity() {
		return capacity;
	}
}
