public class App12 {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        App12 sll = new App12();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);
        ListNode fifth = new ListNode(15);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
    }
}