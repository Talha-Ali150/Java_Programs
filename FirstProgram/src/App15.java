public class App15 {
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
        App15 sll = new App15();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(11);
        ListNode third = new ListNode(12);
        ListNode fourth = new ListNode(13);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();
        sll.insertFirst(9);
        System.out.println();
        sll.display();
    }

    public void insertFirst(int n) {
        ListNode newNode = new ListNode(n);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(" " + current.data);
            current = current.next;
        }
    }
}
