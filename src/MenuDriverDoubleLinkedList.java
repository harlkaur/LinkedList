import java.util.Scanner;

class DoubleLinkedList {
	static DoubleNode head;

	public void insertAtBeg(int data) {
		DoubleNode temp = new DoubleNode();
		temp.setData(data);
		if (head == null)
			head = temp;
		else {
			DoubleNode curr = head;
			temp.setNext(curr);
			curr.setPrev(temp);
			head = temp;
		}
	}

	public void insertAtEnd(int data) {
		DoubleNode temp = new DoubleNode();
		temp.setData(data);
		if (head == null)
			head = temp;
		else {
			DoubleNode curr = head;
			while (curr.getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(temp);
			temp.setPrev(curr);
		}
	}

	public void insertAtMiddle(int data) {
		DoubleNode temp = new DoubleNode();
		temp.setData(data);
		DoubleNode curr = head;
		DoubleNode prev = null;
		int count = 0;
		if (getLength() % 2 == 0) {
			count = getLength() / 2;
			while (count-- > 0) {
				prev = curr;
				curr = curr.getNext();
			}
			prev.setNext(temp);
			temp.setPrev(prev);
			temp.setNext(curr);
			curr.setPrev(temp);
		} else {
			count = getLength() / 2 + 1;
			while (count-- > 0) {
				prev = curr;
				curr = curr.getNext();
			}
			prev.setNext(temp);
			temp.setPrev(prev);
			temp.setNext(curr);
			curr.setPrev(temp);
		}
	}

	public void deleteAtBeg() {
		head = head.getNext();
		head.setPrev(null);
	}

	public void deleteAtEnd() {
		DoubleNode curr = head;
		DoubleNode prev = null;
		while (curr.getNext() != null) {
			prev = curr;
			curr = curr.getNext();
		}
		prev.setNext(null);
	}

	public void deleteAtMiddle() {
		DoubleNode curr = head;
		DoubleNode prev = null;
		int count = 0;
		if (getLength() % 2 == 0) {
			count = getLength() / 2;
			while (count-- > 0) {
				prev = curr;
				curr = curr.getNext();
			}
			if (curr != null && prev != null) {
				prev.setNext(curr.getNext());
				if (curr.getNext() != null)
					curr.getNext().setPrev(prev);
			} else
				head = null;
		} else {
			count = getLength() / 2;
			while (count-- > 0) {
				prev = curr;
				curr = curr.getNext();
			}
			if (curr != null && prev != null) {
				prev.setNext(curr.getNext());
				if (curr.getNext() != null)
					curr.getNext().setPrev(prev);
			} else
				head = null;
		}
	}

	public void displayFromBeg() {
		if (head == null)
			System.out.println(" List is empty , nothing to display !!! ");
		else {
			DoubleNode curr = head;
			while (curr != null) {
				System.out.println(" " + curr.getData() + " ");
				curr = curr.getNext();
			}
		}
	}

	public void displayFromEnd() {
		if (head == null)
			System.out.println(" List is empty , nothing to display !!! ");
		else {
			DoubleNode curr = head;
			while (curr.getNext() != null) {
				curr = curr.getNext();
			}

			while (curr != null) {
				System.out.println(" " + curr.getData() + " ");
				curr = curr.getPrev();
			}
		}
	}

	public int getLength() {
		int count = 0;
		if (head == null)
			System.out.println(" List is empty !!! ");
		else {
			DoubleNode curr = head;
			while (curr != null) {
				count++;
				curr = curr.getNext();
			}
		}
		System.out.println(" Length of list is : " + count);
		return count;
	}
}

public class MenuDriverDoubleLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoubleLinkedList list = new DoubleLinkedList();
		char ch;
		do {
			System.out.println(" 1: Insert element at beginning of list ");
			System.out.println(" 2: Insert element at end of list ");
			System.out.println(" 3: Insert element at middle of list ");
			System.out.println(" 4: Delete element at beginning of list ");
			System.out.println(" 5: Delete element at end of list ");
			System.out.println(" 6: Delete element at middle of list ");
			System.out.println(" 7: Display element from the beg of the list ");
			System.out.println(" 8: Size of linked list ");
			System.out.println(" 9: Display element from the end of the list ");

			System.out.println(" ** Please select the operation to be performed ** ");
			int input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println(" Enter data to be inserted at beg ");
				int data1 = sc.nextInt();
				list.insertAtBeg(data1);
				break;
			case 2:
				System.out.println(" Enter data to be inserted at end ");
				int data2 = sc.nextInt();
				list.insertAtEnd(data2);
				break;
			case 3:
				System.out.println(" Enter data to be inserted at middle ");
				int data3 = sc.nextInt();
				list.insertAtMiddle(data3);
				break;
			case 4:
				list.deleteAtBeg();
				break;
			case 5:
				list.deleteAtEnd();
				break;
			case 6:
				list.deleteAtMiddle();
				break;
			case 7:
				list.displayFromBeg();
				break;
			case 8:
				list.getLength();
				break;
			case 9:
				list.displayFromEnd();
				break;
			default:

			}
			System.out.println(" Do you want to continue operation ? Y or N ");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		sc.close();

	}

}

class DoubleNode {

	private int data;
	private DoubleNode next;
	private DoubleNode prev;

	public DoubleNode() {

	}

	public DoubleNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoubleNode getNext() {
		return next;
	}

	public void setNext(DoubleNode next) {
		this.next = next;
	}

	public DoubleNode getPrev() {
		return prev;
	}

	public void setPrev(DoubleNode prev) {
		this.prev = prev;
	}

}