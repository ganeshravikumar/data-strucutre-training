package data.structure.linkedlist;

public class TestLinkedList {

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.createSingleLinkedList(6);
        sll.insertLinkedListAtLast(19);
        sll.insertLinkedListAtLast(10);
        sll.traverseLinkedList();
        sll.insertAtLocationtLinkedList(12,0);
        sll.insertAtLocationtLinkedList(13,2);
        sll.traverseLinkedList();
        sll.insertAtLocationtLinkedList(15,5);
        sll.traverseLinkedList();
        int loc=sll.searchInLinkedList(13);
        System.out.println(loc);
        System.out.println(sll.size);
        sll.DeleteInLinkedList(2);
        sll.traverseLinkedList();
        System.out.println(sll.size);

    }
}
