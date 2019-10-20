import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Queue<T extends Comparable<T>> {

	LinkedList<T> list = new LinkedList<T>();

	void enqueue(T e) {
		list.addLast(e);

	}

	T dequeue() {
		return list.removeFirst();
	}

	T peek() {
		return list.peekFirst();
	}

	boolean isEmpty() {
		return list.isEmpty();
	}

	static int randomGen(int a, int b) {
		Random r = new Random();
		int size = b - a + 1;
		return r.nextInt(size) + a;
	}

	int size() {
		return list.size();
	}

	void print() {
		for (int i = 0; i < list.size(); ++i) {

			System.out.print(list.get(i) + " ");
			if (i != 0 && i % 10 == 0)
				System.out.println();
		}
	}

	boolean search(T ele) {
		for (int i = 0; i < list.size(); ++i) {

			if (list.get(i) == ele)
				return true;

		}
		return false;
	}

	void swap() {
		if (!list.isEmpty()) {
			T temp = list.removeFirst();
			list.addFirst(list.removeLast());
			list.addLast(temp);

		}

	}

	int count(T ele) {
		int ans = 0;
		for (int i = 0; i < list.size(); ++i) {

			if (list.get(i).compareTo(ele) > 0)
				++ans;

		}
		return ans;
	}
	
	
	public T peekLowestElement() {
		if(list.isEmpty())
			return null;
		
		T ans = list.get(0);
		for (int i = 1; i < list.size(); ++i) {

			if (list.get(i).compareTo(ans) < 0)
				ans = list.get(i);

		}
		return ans;
	}
	
	public T peekHighestElement() {
		if(list.isEmpty())
			return null;
		
		T ans = list.get(0);
		for (int i = 1; i < list.size(); ++i) {

			if (list.get(i).compareTo(ans) > 0)
				ans = list.get(i);

		}
		return ans;
	}
	
	public Queue<T> inverse() {
		
		
		Queue<T>  q = new Queue<T>();
		q.list = this.list;
		Collections.reverse(q.list);
		
		return q;
		
	}
	
	public String toString() {
		return list.toString();
	}

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new Queue<Integer>();
		for(int i=0; i<23; ++i) {
			q1.enqueue(randomGen(20,60));
		}
		
		Queue<Integer> q2 = new Queue<Integer>();
		for(int i=0; i<35; ++i) {
			q2.enqueue(randomGen(10,80));
		}
		
		System.out.println(q1);
		System.out.println(q1.dequeue());
		System.out.println(q1.size());
		System.out.println(q1.search(35));
		System.out.println(q1.peekHighestElement());
		System.out.println(q1.peekLowestElement());
		
		System.out.println(q2);
	}

}
