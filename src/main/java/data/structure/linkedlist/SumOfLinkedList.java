package data.structure.linkedlist;

public class SumOfLinkedList {

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.createSingleLinkedList(1);
        sll.insertLinkedListAtLast(2);
        sll.insertLinkedListAtLast(3);
        sll.traverseLinkedList();
        SingleLinkedList sll2 = new SingleLinkedList();
        sll2.createSingleLinkedList(1);
        sll2.insertLinkedListAtLast(2);
        sll2.insertLinkedListAtLast(3);
        sll2.traverseLinkedList();
        SingleLinkedList sll3 = new SingleLinkedList();
        sll3=sumOfList(sll,sll2);
        sll3.traverseLinkedList();
    }

    private static SingleLinkedList sumOfList(SingleLinkedList sll, SingleLinkedList sll2) {
        SingleLinkedList result = new SingleLinkedList();

        Node node1 =sll.head;
        Node node2=sll2.head;
        while (node1==null && node2==null){
            int resultVal=node1.nodeValue+node2.nodeValue;
            result.insertLinkedListAtLast(resultVal);
            node1=node1.nextReference;
            node2=node2.nextReference;
        }


        return result;
    }
}
