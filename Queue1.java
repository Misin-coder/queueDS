package queue;

/*
 * Not going for generic this time
 */

public class Queue1 {

	int head;
	int tail;
	int[] queue;
	int length;

	public Queue1(int length) {
		head = tail = -1;
		this.queue = new int[length];
		this.length = length;
	}

	public boolean enQueue(int data) {
		if (!isFull()) {
			if (isEmpty()) {
				head = 0;
			}
			tail = (tail + 1) % length;
			queue[tail] = data;
			return true;
		}
		return false;
	}

	public boolean dequeue() {
		if (isEmpty()) {
			return false;
		}
		if (head == tail) {
			head = tail = -1;
			return true;
		}
		head = (head + 1) % length;
		return true;
	}

	private boolean isEmpty() {
		return head == -1;
	}

	private boolean isFull() {
		return (tail + 1) % length == head;
	}

	public int head() {
		 if(!isEmpty()) {
            return queue[head];
        }
        return -1;
	}

	public int tail() {
		if(!isEmpty()) {
            return queue[tail];
        }
        return -1;
	}

	public void show() {
		for (int i = head; i != tail; i = (i + 1) % length) {
			System.out.println(queue[i]);
		}
		System.out.println(tail);
	}

}
