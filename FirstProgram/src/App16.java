public class App16 {
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
        App16 sll = new App16();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(11);
        ListNode third = new ListNode(12);
        ListNode fourth = new ListNode(13);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();
        System.out.println();

        sll.insertLast(15);
        sll.display();

    }

    public void insertLast(int n) {
        ListNode newNode = new ListNode(n);
        if (head == null) {
            head = newNode;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(" " + current.data);
            current = current.next;
        }
    }

}
