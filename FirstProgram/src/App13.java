public class App13 {
    public ListNode head;

    public static class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        App13 sll = new App13();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(11);
        ListNode third = new ListNode(12);
        ListNode fourth = new ListNode(13);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();

    }

    public void display() {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("length of linked list is: " + count);
    }
}