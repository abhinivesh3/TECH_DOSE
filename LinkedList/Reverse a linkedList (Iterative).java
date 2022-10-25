public class Reverse_a_LinkedList(Iterative){

    static void reverseLinkedList( ){
        Node previous=null;
        Node next;
        Node current=head;
        while(current!=null){
            next=cuurent.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        head=previous;
    }
}