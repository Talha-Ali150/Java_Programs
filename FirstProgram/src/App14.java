public class App14 {
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
        App14 sll = new App14();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(11);
        ListNode third = new ListNode(12);
        ListNode fourth = new ListNode(13);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();

        ListNode newNode = new ListNode(9);
        newNode.next = sll.head;
        sll.head = newNode;
        System.out.println();

        sll.display();

    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(" "+current.data+" ");
            current = current.next;
        }
    }

}
