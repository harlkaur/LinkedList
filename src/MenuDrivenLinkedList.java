import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

//Sort Linked List.
//reverse linked list with given number eg kth node.
class LinkedList {
	static Node head;
	static Node head1;
	static Node head2;
	static Node head3;
	static Node newHead;

	public void deleteAtIndex(int index) {
		if (index < 0 || index > getLength()) {
			System.out.println(" Sorry !!! please enter correct index ");
		}

		if (head == null)
			System.out.println(" Sorry, linkedlist is empty ... ");
		else {
			Node curr = head;
			Node prev = null;
			int count = 0;
			while (curr != null && count < index) {
				prev = curr;
				curr = curr.getNext();
				count++;
			}
			prev.setNext(curr.getNext());
		}
	}

	public void insertAtIndex(int index, int data) {
		if (index < 0 || index > getLength()) {
			System.out.println(" Sorry !!! please enter correct index ");
		}
		Node newNode = new Node();
		newNode.setData(data);

		if (head == null)
			head = newNode;
		else {
			Node curr = head;
			Node prev = null;
			int count = 0;
			while (curr != null && count < index) {
				prev = curr;
				curr = curr.getNext();
				count++;
			}
			if (prev != null) {
				prev.setNext(newNode);
				newNode.setNext(curr);
			} else {
				head = newNode;
				head.setNext(curr);
			}
		}
	}

	public void deleteGivenData(int data) {
		if (head == null)
			System.out.println(" Empty linked list, nothing to delete ");
		else {
			Node curr = head;
			Node prev = null;
			while (curr != null /* && curr.getData() != data */) {
				if (curr.getData() != data) {
					prev = curr;
				} else {

					if (prev == null) {
						head = head.getNext();
					} else {
						prev.setNext(curr.getNext());
					}
					break;
				}
				curr = curr.getNext();
			}

			if (curr == null)
				System.out.println(" Given data is not present in linked list ...");
		}
	}

	public int findMaxElement() {
		if (head == null) {
			System.out.println(" Linked List is empty !!! ");
			return Integer.MAX_VALUE;
		} else {
			int max = head.getData();
			Node curr = head;
			while (curr != null) {
				if (curr.getData() > max) {
					max = curr.getData();
				}
				curr = curr.getNext();
			}
			System.out.println(" Max element of linked list is : " + max);
			return max;
		}
	}

	public void deleteMaxElement(int max) {
		if (head == null)
			System.out.println(" Linked List is empty !!! ");
		else {
			Node curr = head;
			Node prev = null;
			if (head.getData() == max) {
				head = head.getNext();
				return;
			}
			while (curr.getData() != max) {
				prev = curr;
				curr = curr.getNext();
			}
			prev.setNext(curr.getNext());
		}
	}

	public void deleteMinElement(int min) {
		if (head == null)
			System.out.println(" Linked List is empty !!! ");
		else {
			Node curr = head;
			Node prev = null;
			if (head.getData() == min) {
				head = head.getNext();
				return;
			}
			while (curr.getData() != min) {
				prev = curr;
				curr = curr.getNext();
			}
			prev.setNext(curr.getNext());
		}

	}

	public int findMinElement() {
		if (head == null) {
			System.out.println(" Linked List is empty!!! ");
			return Integer.MIN_VALUE;
		} else {
			int min = head.getData();
			Node curr = head;
			while (curr != null) {
				if (curr.getData() < min) {
					min = curr.getData();
				}
				curr = curr.getNext();
			}
			System.out.println(" Min element of linked list is : " + min);
			return min;
		}
	}

	public int getLength() {
		int count = 0;
		if (head == null) {
			return 0;
		} else {
			Node curr = head;
			while (curr != null) {
				curr = curr.getNext();
				count++;
			}
		}
		return count;
	}

	public void insertAtBeg(int data) {
		Node temp = new Node();
		temp.setData(data);
		if (head == null) {
			head = temp;
		} else {
			temp.setNext(head);
			head = temp;
		}
	}

	public void insertAtEnd(int data) {
		Node temp = new Node();
		if (head == null)
			head = temp;
		else {
			temp.setData(data);
			temp.setNext(null);

			Node curr = head;
			while (curr.getNext() != null) {
				curr = curr.getNext();

			}
			curr.setNext(temp);
		}
	}

	public void display() {
		if (head == null)
			System.out.println(" Empty linked list, nothing to display :-( ");
		else {
			Node curr = head;
			while (curr != null) {
				System.out.println(curr.getData());
				curr = curr.getNext();
			}
		}
	}

	public void display1() {
		if (head1 == null)
			System.out.println(" Empty linked list, nothing to display :-( ");
		else {
			Node curr1 = head1;
			while (curr1 != null) {
				System.out.println(" Elements of list1 are : " + curr1.getData());
				curr1 = curr1.getNext();
			}
		}
	}

	public void display2() {
		if (head2 == null)
			System.out.println(" Empty linked list, nothing to display :-( ");
		else {
			Node curr2 = head2;
			while (curr2 != null) {
				System.out.println(" Elements of list2 are : " + curr2.getData());
				curr2 = curr2.getNext();
			}
		}
	}

	public void deleteFromBeg() {
		if (head == null)
			System.out.println(" Linked List is empty !!! Nothing to delete ... ");
		else {
			Node curr = head.getNext();
			head = curr;
		}
	}

	public void deleteFromEnd() {
		if (head == null) {
			System.out.println(" Sorry, linked list is empty!!!... ");
		} else {
			Node curr = head;
			while (curr != null && curr.getNext() != null && curr.getNext().getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(null);
		}
	}

	public void insertAtMiddle(int data, int length) {
		Node temp = new Node();
		Node prev = null;
		temp.setData(data);
		if (head == null)
			head = temp;
		else {
			Node curr = head;

			int count = 0;
			if (length % 2 == 0) {
				count = length / 2;
				while (count-- > 0) {
					prev = curr;
					curr = curr.getNext();
				}
				temp.setNext(curr);
				prev.setNext(temp);
			} else {
				count = length / 2 + 1;
				while (count-- > 0) {
					prev = curr;
					curr = curr.getNext();
				}
				temp.setNext(curr);
				prev.setNext(temp);

			}
		}
	}

	public void deleteFromMiddle(int length) {
		if (head == null)
			System.out.println(" Empty linked list , please insert elements to proceed ");
		else {
			Node prev = null;
			Node curr = head;
			int count = 0;
			if (length % 2 == 0) {
				count = length / 2;
				while (count-- > 0) {
					prev = curr;
					curr = curr.getNext();
				}
				prev.setNext(curr.getNext());
			} else {
				count = length / 2 + 1;
				while (count-- > 0) {
					prev = curr;
					curr = curr.getNext();
				}
				if (curr != null)
					prev.setNext(curr.getNext());
				else
					head = null;
			}
		}
	}

	public void reverse() {
		if (head == null)
			System.out.println(" Linked List is empty !!! ");
		else {
			Node curr = head;
			Node prev = null;
			Node next = null;

			while (curr != null) {
				next = curr.getNext();
				curr.setNext(prev);
				prev = curr;
				curr = next;
			}
			head = prev;
		}
	}

	public void displayUsingRecursion(Node curr) {
		if (curr == null)
			return;
		else {
			System.out.println(curr.getData());
			displayUsingRecursion(curr.getNext());
		}
	}

	public void reversePrintUsingRecursion(Node curr) {
		if (curr == null)
			return;
		else
			reversePrintUsingRecursion(curr.getNext());
		System.out.println(curr.getData());
	}

	public void removeDuplicates() {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			if (!map.containsKey(curr.getData())) {
				map.put(curr.getData(), 555);
				prev = curr;
			} else {
				prev.setNext(curr.getNext());
			}
			curr = curr.getNext();
		}
	}

	public void insertDatainSortedOrder(int data) {
//		Node temp = new Node();
//		temp.setData(data);
//		Node curr = head;
//		int count = 0;
//		Node prev = new Node();
//		if (head == null)
//			head = temp;
//		else {
//			while (curr != null) {
//				if (temp.getData() < curr.getData()) {
//					if (getLength() == 1) {
//						head = temp;
//					}
//					temp.setNext(curr);
//					if (prev.getNext() != null) {
//						prev.setNext(temp);
//					} else
//						head = temp;
//					break;
//				} else {
//					count++;
//				}
//				prev = curr;
//				curr = curr.getNext();
//			}
//			if (count == getLength()) {
//				curr = head;
//				while (curr.getNext() != null) {
//					curr = curr.getNext();
//				}
//				curr.setNext(temp);
//				temp.setNext(null);
//			}
//		}

		Node temp = new Node();
		temp.setData(data);
		Node curr = head;
		Node prev = null;
		while (curr != null && temp.getData() > curr.getData()) {
			prev = curr;
			curr = curr.getNext();
		}

		if (prev == null) {
			temp.setNext(head);
			head = temp;
		} else {
			prev.setNext(temp);
			temp.setNext(curr);
		}

	}

	public void reverseTwoElements() {
		Node curr = head;
		Node temp = new Node();
		while (curr != null && curr.getNext() != null) {
			temp.setData(curr.getData());
			curr.setData(curr.getNext().getData());
			curr.getNext().setData(temp.getData());
			curr = curr.getNext().getNext();
		}
	}

//	public void reverseTwoElementsWithPointers() {
//		Node curr = head;
//		boolean flag = true;
//		Node temp = null;
//		while (curr != null && curr.getNext() != null) {
//			temp = curr.getNext();
//			temp.setNext(curr);
//			curr = curr.getNext();
//			curr.setNext(curr.getNext());
//			if (flag) {
//				head = temp;
//				flag = false;
//			}
//		}
//
//	}

	public void reverseTwoElementsWithPointers() {
		Node curr = head;
		Node temp = null;
		Node next = null;
		boolean flag = true;
		while (curr != null && curr.getNext() != null) {
			if (temp != null)
				temp.getNext().setNext(curr.getNext());

			temp = curr.getNext();
			next = temp.getNext();
			if (next != null)
				System.out.println(" next data: " + next.getData());
			temp.setNext(curr);
			curr.setNext(curr.getNext().getNext());

			System.out.println(" temp value: " + temp.getData());
			System.out.println(" curr data: " + curr.getData());

			curr.getNext().setNext(next);
			curr = curr.getNext();
			if (flag) {
				head = temp;
				flag = false;
			}
		}
	}

	// traverse list1 and search for each element in list2, if present display them.
	public void intersectionOfTwoLists(Node head1, Node head2) {
		Node curr1 = head1;
		Node curr2 = head2;

		while (curr1 != null) {
			if (isPresent(curr1.getData(), curr2)) {
				System.out.println(" Commom elements of two lists are : " + curr1.getData());
			}
			curr1 = curr1.getNext();
		}
	}

	private boolean isPresent(int data, Node curr2) {
		boolean result = false;
		while (curr2 != null) {
			if (curr2.getData() == data) {
				result = true;
				break;
			}
			curr2 = curr2.getNext();
		}
		return result;
	}

	public void unionOfLists(LinkedList list1, LinkedList list2) {
		if (list1 == null && list2 == null) {
			System.out.println(" Lists are empty ");
			return;
		}
		HashSet<Integer> set = new HashSet<Integer>();
		Node curr1 = null;
		Node curr2 = null;
		if (list1.head != null) {
			curr1 = list1.head;
			while (curr1 != null) {
				set.add(curr1.getData());
				curr1 = curr1.getNext();
			}
		} else if (list2.head != null) {
			curr2 = list2.head;
			while (curr2 != null) {
				set.add(curr2.getData());
				curr2 = curr2.getNext();
			}
		}
		System.out.println(" Displaying elements of both the lists ");
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	public void push1(int data) {
		Node temp = new Node();
		temp.setData(data);
		temp.setNext(head1);
		head1 = temp;
	}

	public void push2(int data) {
		Node temp = new Node();
		temp.setData(data);
		temp.setNext(head2);
		head2 = temp;
	}

	public void push3(int data) {
		Node temp = new Node();
		temp.setData(data);
		temp.setNext(head3);
		head3 = temp;
	}

	public void differenceOfList1From2(Node head1, Node head2) {
		Node curr1 = head1;
		Node curr2 = head2;
		while (curr2 != null) {
			commonElements(curr1, curr2.getData());
			curr2 = curr2.getNext();
		}
	}

	private void commonElements(Node curr1, int data) {
		Node prev = null;
		while (curr1 != null) {
			if (curr1.getData() != data) {
				prev = curr1;
			} else {
				if (prev == null) {
					head1 = head1.getNext();
				} else {
					prev.setNext(curr1.getNext());
				}
				break;
			}
			curr1 = curr1.getNext();
		}
	}

	public void differenceOfList2From1(Node head1, Node head2) {
		Node curr1 = head1;
		Node curr2 = head2;
		while (curr1 != null) {
			commonElements(curr2, curr1.getData());
			curr1 = curr1.getNext();
		}
	}

	public boolean checkForPalindrome() {
		Node midNode = null;

		boolean result = false;
		Node curr = head;
		Node prev = null;
		int midElement = 0;
		int count = 0;
		int length = getLength();

		if (length / 2 == 0) {
			midElement = length / 2;
			while (midElement-- > 0) {
				prev = curr;
				curr = curr.getNext();
			}
			midNode = curr;
		} else {
			midElement = length / 2 + 1;
			while (midElement-- > 0) {
				prev = curr;
				curr = curr.getNext();
			}
			midNode = curr;
		}

		// reversing second half of linked list with curr as head
		curr = midNode;
		Node temp = null;
		Node next = null;
		Node ref = curr;

		while (curr != null) {
			next = curr.getNext();
			curr.setNext(temp);
			temp = curr;
			curr = next;
		}

		prev.setNext(temp);

		// comparing linked list with head and ref as starting nodes....
		ref = temp;
		while (head != midNode && ref != null) {
			if (head.getData() == ref.getData()) {
				head = head.getNext();
				ref = ref.getNext();
				count++;
			} else {
				result = false;
				break;
			}
		}

		// verifying if the elements till mid element are matching by counter variable
		if (count == (length / 2))
			result = true;
		else
			result = false;

		return result;
	}

	public boolean detectLoop() {

		// code to create loop in linked list // TODO remove this if testing for no loop
		// condition
		LinkedList.head.getNext().getNext().setNext(LinkedList.head);

		boolean isCycle = false;
		Node fastPtr = head;
		Node slowPtr = head;
		while (fastPtr != null && fastPtr.getNext() != null) {
			fastPtr = fastPtr.getNext().getNext();
			slowPtr = slowPtr.getNext();
			if (fastPtr == slowPtr) {
				isCycle = true;
				break;
			}
		}
		return isCycle;
	}

	public int noOfOccurrances(int dataInput) {
		int result = 0;
		Node curr = head;
		if (head == null) {
			System.out.println(" Linked list is empty ");
			return result;
		} else {
			while (curr != null) {
				if (curr.getData() == dataInput)
					result++;
				curr = curr.getNext();
			}
		}
		return result;
	}

	public void deleteAlternateNodes() {
		if (head == null)
			System.out.println(" Linked List is empty ... Nothing to delete ");
		else {
			Node curr = head;
			while (curr.getNext() != null && curr.getNext().getNext() != null) {
				curr.setNext(curr.getNext().getNext());
				curr = curr.getNext();
			}
			if (curr.getNext() != null)
				curr.setNext(null);
		}
	}

	public void reverseDatainList() {
		if (head == null)
			System.out.println(" Linked List is empty, Insert items to print reverse data ");
		else {
			Node curr = head;
			Stack<Integer> stack = new Stack<Integer>();
			while (curr != null) {
				stack.add(curr.getData());
				curr = curr.getNext();
			}

			for (int i = stack.size() - 1; i >= 0; i--) {
				System.out.println(stack.get(i));
			}
		}
	}

	public void addEachElement(LinkedList first, LinkedList second) {
		Node curr1 = first.head1;
		Node curr2 = second.head2;
		LinkedList third = new LinkedList();
		int value = 0;
		while (curr1 != null || curr2 != null) {
			if (curr1 != null && curr2 != null) {
				value = curr1.getData() + curr2.getData();
				curr1 = curr1.getNext();
				curr2 = curr2.getNext();
			} else if (curr1 == null) {
				value = curr2.getData();
				curr2 = curr2.getNext();
			} else if (curr2 == null) {
				value = curr1.getData();
				curr1 = curr1.getNext();
			}
			third.push3(value);
		}

		Node curr3 = third.head3;

		System.out.println(" ");
		System.out.println(" Printing result of third list ");
		System.out.println(" ");

		while (curr3 != null) {
			System.out.println(curr3.getData());
			curr3 = curr3.getNext();
		}
	}

	public void addElementsWithCarryConcept(LinkedList fs, LinkedList snd) {
		Node curr1 = fs.head1;
		Node curr2 = snd.head2;
		LinkedList third = new LinkedList();
		int value = 0;
		int carry = 0;
		int num = 0;
		while (curr1 != null || curr2 != null) {
			if (curr1 != null && curr2 != null) {
				num = curr1.getData() + curr2.getData() + carry;
				value = (num) % 10;
				carry = num / 10;
				curr1 = curr1.getNext();
				curr2 = curr2.getNext();
			} else if (curr1 == null) {
				num = curr2.getData() + carry;
				value = num % 10;
				carry = num / 10;
				curr2 = curr2.getNext();
			} else if (curr2 == null) {
				num = curr1.getData() + carry;
				value = (num) % 10;
				carry = num / 10;
				curr1 = curr1.getNext();
			}
			third.push3(value);
		}

		if (carry != 0)
			third.push3(carry);

		Node curr3 = third.head3;
		System.out.println(" ");
		System.out.println(" Printing result of third list ");
		System.out.println(" ");

		while (curr3 != null) {
			System.out.print(curr3.getData());
			curr3 = curr3.getNext();
		}
	}

	public void evenOddSeparation(LinkedList evenOdd) {
		Node curr = head1;
		Node prev = null;
		boolean flag = true;
		int data = 0;
		LinkedBlockingQueue<Integer> temp = new LinkedBlockingQueue<Integer>();
		LinkedList third = new LinkedList();
		
		while (curr != null) {
			data = curr.getData();
			if (data % 2 != 0) {
				temp.add(curr.getData());
				curr = curr.getNext();
				if (prev != null) {
					prev.setNext(curr);
				}
				if (prev == null) {
					head1 = curr;
					flag = false;
				}
			} else {
				prev = curr;
				curr = curr.getNext();
				flag = false;
			}
		}

		System.out.println(" Displaying evenOdd list ");
		curr = head1;
		while (curr != null) {
			System.out.print(curr.getData());
			curr = curr.getNext();
		}
		System.out.println(" Data of linkedBlockingQueue ");
		Iterator<Integer> iter = temp.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next());
		}
	}

}

class Node {
	private int data;
	private Node next;

	public Node() {

	}

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}

public class MenuDrivenLinkedList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		char ch;
		do {
			System.out.println(" 0: Calculate length of linked list ");
			System.out.println(" 1: Insert the element at the beg ");
			System.out.println(" 2: Insert the element at the end  ");
			System.out.println(" 3: Insert the element at the middle  ");
			System.out.println(" 4: Insert the element at specified index ");
			System.out.println(" 5: Delete the element from middle ");
			System.out.println(" 6: Delete the element from Beg ");
			System.out.println(" 7: Delete the element from the end ");
			System.out.println(" 8: Delete the element from the specified position ");
			System.out.println(" 9: Delete the given data in linked list ");
			System.out.println(" 10: Displaying the linked list ");
			System.out.println(" 11: Finding the max element of linked list ");
			System.out.println(" 12: Finding the min element of linked list ");
			System.out.println(" 13: Deleting max element from linked list ");
			System.out.println(" 14: Deleting min element from linked list ");
			System.out.println(" 15: Reversing a linked list ");
			System.out.println(" 16: Display using recursion ");
			System.out.println(" 17: Print reverse of linked list using recursion ");
			System.out.println(" 18: Removing duplicates from linked list ");
			System.out.println(" 19: Insert element in sorted manner ");
			System.out.println(" 20: Reverse two elements of linked list at a time ");
			System.out.println(" 21: Reversing two elements of linked list with pointers at a time ");
			System.out.println(" 22: Intersection of two lists  ");
			System.out.println(" 23: Union of two lists without duplicates ");
			System.out.println(" 24: Difference of List1 from List2 ");
			System.out.println(" 25: Difference of List2 from List1 ");
			System.out.println(" 26: Check if list is palindrome ");
			System.out.println(" 27: Detecting loop in linked list ");
			System.out.println(" 28: Finding no of occurrances of given Data in linked list ");
			System.out.println(" 29: Deleting alternate nodes in single linked list ");
			System.out.println(
					" 30: Print data of single linked list in reverse order without reversing the linked list ");
			System.out.println(" 31: Addition of each element of two linked list ");
			System.out.println(" 32: Separate even and odd numbers from the given linked list ");
			System.out.println(" 33: Addition of each element of two linked list with carry over concept ");

			System.out.println("  ");
			System.out.println(" Please enter the operation !!! ");
			int input = sc.nextInt();
			System.out.println("  ");

			switch (input) {
			case 0:
				int length = list.getLength();
				System.out.println(" Length of list is : " + length);
				break;
			case 1:
				System.out.println("Please enter the data to be inserted ... ");
				int data1 = sc.nextInt();
				list.insertAtBeg(data1);
				break;
			case 2:
				System.out.println("Please enter the data to be inserted ... ");
				int data2 = sc.nextInt();
				list.insertAtEnd(data2);
				break;
			case 3:
				System.out.println("Please enter the data to be inserted ... ");
				int data = sc.nextInt();
				int size = list.getLength();
				list.insertAtMiddle(data, size);
				break;
			case 4:
				System.out.println("Please enter the index and data for the element to be inserted ... ");
				int index = sc.nextInt();
				int element = sc.nextInt();
				list.insertAtIndex(index, element);
				break;
			case 5:
				int len = list.getLength();
				list.deleteFromMiddle(len);
				break;
			case 6:
				list.deleteFromBeg();
				break;
			case 7:
				list.deleteFromEnd();
				break;
			case 8:
				System.out.println("Please enter the index to be deleted ... ");
				int d3 = sc.nextInt();
				list.deleteAtIndex(d3);
				break;
			case 9:
				System.out.println("Please enter the data to be deleted ... ");
				int d4 = sc.nextInt();
				list.deleteGivenData(d4);
				break;
			case 10:
				list.display();
				break;
			case 11:
				int maxElement = list.findMaxElement();
				System.out.println(" Max element of linked list " + maxElement);
				break;
			case 12:
				System.out.println(" Min element of linked list ");
				list.findMinElement();
				break;
			case 13:
				System.out.println(" Deleting max element from linked list ");
				int max = list.findMaxElement();
				list.deleteMaxElement(max);
				break;
			case 14:
				System.out.println(" Deleting min element from linked list ");
				int min = list.findMinElement();
				list.deleteMinElement(min);
				break;
			case 15:
				System.out.println(" Reversing a linked list ");
				list.reverse();
				break;
			case 16:
				System.out.println(" Displaying the list using recursion ");
				list.displayUsingRecursion(list.head);
				break;
			case 17:
				System.out.println(" Reversing the list using recursion ");
				list.reversePrintUsingRecursion(list.head);
				break;
			case 18:
				System.out.println(" Removing duplicates from linked list ");
				list.removeDuplicates();
				list.display();
				break;
			case 19:
				System.out.println(" Enter the data to be inserted ");
				int sortedData = sc.nextInt();
				list.insertDatainSortedOrder(sortedData);
				list.display();
				break;
			case 20:
				System.out.println(" Reversing two elements of linked list at a time ");
				list.reverseTwoElements();
				list.display();
				break;
			case 21:
				System.out.println(" Reversing two elements with pointers at a time ");
				list.reverseTwoElementsWithPointers();
				list.display();
				break;
			case 22:
				System.out.println(" Common elements in linked list are ");
				LinkedList list1 = new LinkedList();
				LinkedList list2 = new LinkedList();
				System.out.println(" Enter size of list 1 ");
				int SZ1 = sc.nextInt();
				System.out.println(" Enter elements of list 1 ");
				for (int i = 0; i < SZ1; i++) {
					list1.push1(sc.nextInt());
				}

				System.out.println(" Enter size of list 2 ");
				int SZ2 = sc.nextInt();
				System.out.println(" Enter elements of list 2 ");
				for (int i = 0; i < SZ2; i++) {
					list2.push2(sc.nextInt());
				}
				list1.display1();
				list2.display2();
				list.intersectionOfTwoLists(list1.head1, list2.head2);
				break;
			case 23:
				System.out.println(" Union of linked list ");
				LinkedList list11 = new LinkedList();
				LinkedList list22 = new LinkedList();
				System.out.println(" Enter size of list 1 ");
				int SZ11 = sc.nextInt();
				System.out.println(" Enter elements of list 1 ");
				for (int i = 0; i < SZ11; i++) {
					list11.insertDatainSortedOrder(sc.nextInt());
				}

				System.out.println(" Enter size of list 2 ");
				int SZ22 = sc.nextInt();
				System.out.println(" Enter elements of list 2 ");
				for (int i = 0; i < SZ22; i++) {
					list22.insertDatainSortedOrder(sc.nextInt());
				}

				list.unionOfLists(list11, list22);
				break;
			case 24:
				System.out.println(" Difference of list1 from list2 ");
				LinkedList list111 = new LinkedList();
				LinkedList list222 = new LinkedList();
				System.out.println(" Enter size of list 1 ");
				int SZ111 = sc.nextInt();
				System.out.println(" Enter elements of list 1 ");
				for (int i = 0; i < SZ111; i++) {
					list111.push1(sc.nextInt());
				}

				System.out.println(" Enter size of list 2 ");
				int SZ222 = sc.nextInt();
				System.out.println(" Enter elements of list 2 ");
				for (int i = 0; i < SZ222; i++) {
					list222.push2(sc.nextInt());
				}
				list111.display1();
				list222.display2();
				list.differenceOfList1From2(list111.head1, list222.head2);
				System.out.println(" Printing Difference of elements in list1 after method call : ");
				list111.display1();
				break;
			case 25:
				System.out.println(" Difference of list2 from list1 ");
				LinkedList diffList1 = new LinkedList();
				LinkedList diffList2 = new LinkedList();
				System.out.println(" Enter size of list 1 ");
				int sizeLen = sc.nextInt();
				System.out.println(" Enter elements of list 1 ");
				for (int i = 0; i < sizeLen; i++) {
					diffList1.push1(sc.nextInt());
				}

				System.out.println(" Enter size of list 2 ");
				int sizeLen2 = sc.nextInt();
				System.out.println(" Enter elements of list 2 ");
				for (int i = 0; i < sizeLen2; i++) {
					diffList2.push2(sc.nextInt());
				}
				diffList1.display1();
				diffList2.display2();
				list.differenceOfList2From1(diffList1.head1, diffList2.head2);
				System.out.println(" Printing Difference of elements in list2 after method call : ");
				diffList1.display2();
				break;
			case 26:
				boolean result = list.checkForPalindrome();
				System.out.println(" Palindrome feature of given linked list: " + result);
				break;
			case 27:
				boolean isCyclic = list.detectLoop();
				System.out.println(" Detecting loop in linked list: " + isCyclic);
				break;
			case 28:
				System.out.println(" Enter the data to find the occurrances for ");
				int dataInput = sc.nextInt();
				int noOfOccurrances = list.noOfOccurrances(dataInput);
				System.out.println(" Given Data " + dataInput + " has occurred " + noOfOccurrances + " times. ");
				break;
			case 29:
				System.out.println(" Deleting alternate nodes at linked list ");
				list.deleteAlternateNodes();
				list.display();
				break;
			case 30:
				System.out.println(" Printing data of single linked list in reverse order without reversing the list ");
				list.reverseDatainList();
				break;
			case 31:
				System.out.println(" Addition of each element in two linked list ");
				LinkedList first = new LinkedList();
				LinkedList second = new LinkedList();

				System.out.println(" Enter size of list 1 ");
				int firstSize = sc.nextInt();
				System.out.println(" Enter elements of list 1 ");
				for (int i = 0; i < firstSize; i++) {
					first.push1(sc.nextInt());
				}

				System.out.println(" Enter size of list 2 ");
				int secondSize = sc.nextInt();
				System.out.println(" Enter elements of list 2 ");
				for (int i = 0; i < secondSize; i++) {
					second.push2(sc.nextInt());
				}
				first.display1();
				second.display2();

				list.addEachElement(first, second);
				break;
			case 32:
				System.out.println(" Separating even and odd numbers from a linked list ");
				LinkedList evenOdd = new LinkedList();
				System.out.println(" Enter the size of linked list ");
				int sizee = sc.nextInt();
				System.out.println(" Enter the elements of list ");
				for (int i = 0; i < sizee; i++) {
					evenOdd.push1(sc.nextInt());
				}
				list.display1();
				list.evenOddSeparation(evenOdd);

				break;
			case 33:
				System.out.println(" Addition of each element in two linked list with carry over concept ");
				LinkedList fs = new LinkedList();
				LinkedList snd = new LinkedList();

				System.out.println(" Enter size of list 1 ");
				int fsize = sc.nextInt();
				System.out.println(" Enter elements of list 1 ");
				for (int i = 0; i < fsize; i++) {
					fs.push1(sc.nextInt());
				}

				System.out.println(" Enter size of list 2 ");
				int ssize = sc.nextInt();
				System.out.println(" Enter elements of list 2 ");
				for (int i = 0; i < ssize; i++) {
					snd.push2(sc.nextInt());
				}

				fs.display1();
				snd.display2();

				list.addElementsWithCarryConcept(fs, snd);
				break;
			default:
				System.out.println("Wrong entry !!! ");
				break;
			}
			System.out.println(" Do you wish to continue ? Y or N ");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		sc.close();
	}

}
