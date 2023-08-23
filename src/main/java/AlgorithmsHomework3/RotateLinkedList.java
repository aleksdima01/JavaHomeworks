package AlgorithmsHomework3;

import AlgorithmsHomework3.LinkedList.Node;

public class RotateLinkedList<T> {
    LinkedList newList = new LinkedList();
    private Node newHead;
    public Node next;


    public void rotate(LinkedList list) {
        this.newList = list;
        Node previousNode = null;
        Node node = newList.getHead();
        //Node nextNode = newList.getHead().next;
        while (node != null) {
            Node nextNode = node.next;
            node.next = previousNode;
            previousNode = node;
            node = nextNode;

        }
        //node.next = previousNode;
        newHead = previousNode;
        newList.addFirst(newHead.value);


//        while (node != null) {
//            node = node.next;
//            counter++;
//        }
//        while (counter > 0) {
//            node = newList.getHead();
//            Node finalNode = node;
//            while (node != null) {
//                finalNode = node;
//                node = node.next;
//            }
//            newHead = finalNode;
//            newList.addFirst(newHead.value);
//            newList.removeLast();
//            counter--;
//        }

    }

}
