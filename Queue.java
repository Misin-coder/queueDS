package queue;

/*
 * queue implemenation using dynamic array 
 * this way is not an efficient way as it leads to wastage of space;
 */

import java.util.ArrayList;

public class Queue<E> {

	int head;
	ArrayList<E> queue;

	public Queue() {
		head = 0;
		queue = new ArrayList<>();
	}

	public boolean enQueue(E data) {

		queue.add(data);
		return true;

	}

	public boolean deQueue() {

		if (isEmpty()) {
			return false;
		}
		head++;
		return true;
	}

	public boolean isEmpty() {

		return head >= queue.size();
	}

	public E front() {
		return queue.get(head);
	}

}
