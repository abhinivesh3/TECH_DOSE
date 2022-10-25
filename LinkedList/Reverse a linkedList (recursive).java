public class Reverse_a_LinkedList(Recursive){

    static Node reverse(Node head){
        if(head==null) return null;
        HEAD = null;
        solve(head);
        return HEAD;
    }

    static Node solve(Node head) {
        if (head.next == null) {
            HEAD = head;
            return head;
        }
        Node nextEnd = solve(head.next);
        head.next = null;
        nextEnd.next = head;
        return head;
    }
}