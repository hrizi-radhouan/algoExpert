package interviews;

public class ReversedLinkedList{
	public static void main(String[] args) {
		/*
		 * Input: head = [1,2,3,4,5] Output: [5,4,3,2,1]
		 */
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		displayList(head);
		ListNode output = reverseLinkedList(head);
		displayList(output);
	}

	static ListNode reverseLinkedList(ListNode head) {

		ListNode curr = head;
		ListNode output = new ListNode(curr.val);
		/*
		 * curr = head 
		 * output.val = curr.val
		 * 
		 * loop over head while curr.next != null 
		 * next_guy = curr.next 
		 * output = new ListNode(next_guy.val, output)
		 *  curr = next_guy
		 * 
		 */

		while (curr.next != null) {
			ListNode nextGuy = curr.next;
			output = new ListNode(nextGuy.val, output);
			curr = nextGuy;
		}

		return output;
	}
	
	static void displayList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " / ");
			head = head.next;
		}
		System.out.println();
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

}