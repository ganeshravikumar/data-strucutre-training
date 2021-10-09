package data.structure.linkedlist;

public class ReturnNthTotheLastValue {

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.createSingleLinkedList(1);
        sll.insertLinkedListAtLast(2);
        sll.insertLinkedListAtLast(3);
        sll.insertLinkedListAtLast(4);
        sll.insertLinkedListAtLast(5);
        sll.insertLinkedListAtLast(6);
        sll.insertLinkedListAtLast(7);
        sll.traverseLinkedList();
        System.out.println(returnNthLast(sll,2));
    }

    private static int returnNthLast(SingleLinkedList sll, int i) {
        Node pointer1 =sll.head;
        Node pointer2 =sll.head;
        for (int j = 1; j < i; j++) {
            pointer2=pointer2.nextReference;

        }

        while (pointer2.nextReference!=null){
            pointer1=pointer1.nextReference;
            pointer2=pointer2.nextReference;
        }
        return pointer1.nodeValue;
    }
}
