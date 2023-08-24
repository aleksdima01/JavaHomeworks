package AlgorithmsHomework3;

import java.util.Comparator;

/**
 * Связный список
 *
 * @param <T>
 */
public class LinkedList<T> {

    /**
     * Указатель на первый элемент связного списка
     */
    private Node head;

    /**
     * Узел связного списка
     */
    public class Node {
        /**
         * Ссылка на следующий узел
         */
        public Node next;

        /**
         * Значение узла
         */
        public T value;
    }

    /**
     * Добавление нового элемента в начало связного списка
     *
     * @param value значение
     */
    public void addFirst(T value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    /**
     * Удалить первый элемент связного списка
     */
    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public Node getHead() {
        return head;
    }

    /**
     * Поиск элемента в связном списке по значению
     *
     * @param value значение
     * @return
     */
    public boolean contains(T value) {
        Node node = head;
        while (node != null) {
            if (node.value.equals(value))
                return true;
            node = node.next;
        }
        return false;
    }

    /**
     * Сортировка связного списка с помощью comparator
     *
     * @param comparator
     */
    public void sort(Comparator<T> comparator) {
        Node node = head;
        while (node != null) {
            Node minValueNode = node;
            Node node2 = node.next;
            while (node2 != null) {
                if (comparator.compare(minValueNode.value, node2.value) > 0) {
                    minValueNode = node2;
                }
                node2 = node2.next;
            }
            if (minValueNode != node) {
                T buf = node.value;
                node.value = minValueNode.value;
                minValueNode.value = buf;
            }
            node = node.next;
        }
    }

    /**
     * Добавдение элемента в конец связного списка
     *
     * @param value значение
     */
    public void addLast(T value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
    }

    /**
     * Удаление последнего элемента связного списка
     */
    public void removeLast() {
        if (head == null)
            return;
        Node node = head;
        while (node.next != null) {
            if (node.next.next == null) {
                node.next = null;
                return;
            }
            node = node.next;
        }
        head = null;
    }

    /**
     * Разворот односвязного списка
     *
     * @param list передаваемый список
     */
    public void rotate(LinkedList list) {
        Node previousNode = null;
        Node node = list.getHead();
        while (node != null) {
            Node nextNode = node.next;
            node.next = previousNode;
            previousNode = node;
            node = nextNode;

        }
        list.head = previousNode;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        Node node = head;
        while (node != null) {
            stringBuilder.append(node.value);
            node = node.next;
            if (node != null)
                stringBuilder.append('\n');

        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}