package queue;

public class Tester {

	public static void main(String[] args) {

		Queue1 q = new Queue1(5);
		for(int i = 0; i< 8; i++) {
			q.enQueue(i);
		}
		for(int i = 0; i< 8; i++) {
			q.dequeue();
		}
		q.show();
		
	}

}
