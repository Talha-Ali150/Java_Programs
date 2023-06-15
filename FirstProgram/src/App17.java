public class App17 {
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
        App17 sll = new App17();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(11);
        ListNode third = new ListNode(12);
        ListNode fourth = new ListNode(13);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();
        System.out.println();

        sll.insertGiven(4, 100);
        sll.display();
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(" " + current.data);
            current = current.next;
        }
    }

    public void insertGiven(int position, int value) {
        ListNode node = new ListNode(value);
        int count = 1;
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            while(count<position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next=current;
        }
    }

}
