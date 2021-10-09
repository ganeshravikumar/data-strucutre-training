package data.structure.linkedlist;

public class DeleteDuplicate {

    public static void main(String[] args) {
        System.out.println("testing");

        SingleLinkedList sLL=new SingleLinkedList();
        sLL.createSingleLinkedList(1);
        sLL.insertLinkedListAtLast(2);
        sLL.insertLinkedListAtLast(1);
        sLL.insertLinkedListAtLast(3);
        sLL.insertLinkedListAtLast(2);
        sLL.insertLinkedListAtLast(1);
        sLL.traverseLinkedList();
        sLL.deleteDuplicate();
        sLL.traverseLinkedList();
    }
}
