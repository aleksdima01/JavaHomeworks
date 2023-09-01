package AlgorithmsHomework4;


import java.util.ArrayList;
import java.util.Iterator;

public class HashMap<K, V> implements Iterable<HashMap.Entity> {


    private static final int INIT_BUCKET_COUNT = 16;
    private static final double LOAD_FACTOR = 0.5;

    private Bucket[] buckets;
    private Bucket.Node currentNode;
    private int currentIndex;
    private int size;


    @Override
    public Iterator<HashMap.Entity> iterator() {
        return new HashMapIterator();
    }

    class HashMapIterator implements Iterator<HashMap.Entity> {
        //
//        /**
//         * TODO: Необходимо доработать структуру класса HashMap, реализованную на семинаре.
//         * У нас появились методы добавления, удаления и поиска элемента по ключу.
//         * Добавить возможность перебора всех элементов нашей структуры данных,
//         * необходимо добавить несколько элементов,
//         * а затем перебрать все элементы таблицы используя цикл foreach.
//         * Подумайте, возможно вам стоит обратиться к интерфейсу Iterable.
//         *
//         * @return
//         */
//
//
//
        @Override
        public boolean hasNext() {
            if (currentNode == null) {
                for (int i = 0; i < buckets.length; i++)
                    if (buckets[i] != null && buckets[i].head != null) {
                        currentIndex = i;
                        currentNode = buckets[i].head;
                        return true;
                    }
                return false;
            } else {
                if (get((K) currentNode.value.key) == null) {
                    currentNode = null;
                    currentIndex = 0;
                    return hasNext();
                } else {
                    HashMap.Bucket.Node node = currentNode;
                    currentIndex = calculateBucketIndex((K) node.value.key);
                    if (node.next != null) {
                        currentNode = node.next;
                        return true;
                    }
                    for (int i = ++currentIndex; i < buckets.length; i++) {
                        if (buckets[i] != null && buckets[i].head != null) {
                            currentIndex = i;
                            currentNode = buckets[i].head;
                            return true;
                        }
                    }
                    currentNode = null;
                    currentIndex = 0;
                    return false;
                }
            }
        }


        public Entity next() {
            if (currentNode == null) {
                for (int i = 0; i < buckets.length; i++)
                    if (buckets[i] != null && buckets[i].head != null) {
                        currentIndex = i;
                        currentNode = buckets[i].head;
                        return currentNode.value;
                    }
                return null;
            } else if (get((K) currentNode.value.key) == null) {
                currentNode = null;
                currentIndex = 0;
                return null;
            } else
                return currentNode.value;
        }

    }

    /**
     * TODO: Вывести все элементы хеш-таблицы на экран через toString()
     *
     * @return
     */
    @Override
    public String toString() {
//        ArrayList list = new ArrayList<>();
//        for (int i = 0; i < buckets.length; i++) {
//            if (buckets[i] != null) {
//                list.add(buckets[i]);
//            }
//        }
        //  return list.toString();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] != null) {
                stringBuilder.append(buckets[i]);
                if (buckets[i] != null)
                    stringBuilder.append('\n');
            }

        }
        return stringBuilder.toString();
    }


    /**
     * Элемент хеш-таблицы
     */
    class Entity {

        /**
         * Ключ
         */
        K key;

        /**
         * Значение элемента
         */
        V value;

        @Override
        public String toString() {
            return "Entity{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    /**
     * Бакет, связный список
     */
    class Bucket {

        /**
         * Указатель на первый элемент связного списка
         */
        Node head;

        /**
         * Узел бакета (связного списка)
         */
        class Node {

            /**
             * Указатель на следующий элемент связного списка
             */
            Node next;

            /**
             * Значение узла, указывающее на элемент хеш-таблицы
             */
            Entity value;

            @Override
            public String toString() {
                return "Node{" +
                        "value=" + value +
                        '}';
            }
        }

        public V add(Entity entity) {
            Node node = new Node();
            node.value = entity;

            if (head == null) {
                head = node;
                return null;
            }

            Node currentNode = head;
            while (true) {
                if (currentNode.value.key.equals(entity.key)) {
                    V buf = currentNode.value.value;
                    currentNode.value.value = entity.value;
                    return buf;
                }
                if (currentNode.next != null) {
                    currentNode = currentNode.next;
                } else {
                    currentNode.next = node;
                    return null;
                }
            }
        }

        public V remove(K key) {
            if (head == null)
                return null;
            if (head.value.key.equals(key)) {
                V buf = head.value.value;
                head = head.next;
                return buf;
            } else {
                Node node = head;
                while (node.next != null) {
                    if (node.next.value.key.equals(key)) {
                        V buf = node.next.value.value;
                        node.next = node.next.next;
                        return buf;
                    }
                    node = node.next;
                }
                return null;
            }
        }

        public V get(K key) {
            Node node = head;
            while (node != null) {
                if (node.value.key.equals(key))
                    return node.value.value;
                node = node.next;
            }
            return null;
        }

        @Override
        public String toString() {
            boolean a = false;
            Node node = head.next;
            ArrayList nextHead = new ArrayList();
            while (node != null) {
                nextHead.add(node);
                node = node.next;
            }
            if (nextHead.size() != 0) {
                return "Bucket{" +
                        "head=" + head + " " +
                        nextHead +
                        '}' + "\n";
            } else {
                return "Bucket{" +
                        "head=" + head +
                        '}' + "\n";
            }
        }
    }

    private int calculateBucketIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    private void recalculate() {
        size = 0;
        Bucket[] old = buckets;
        buckets = new HashMap.Bucket[old.length * 2];
        for (int i = 0; i < old.length; i++) {
            Bucket bucket = old[i];
            if (bucket != null) {
                Bucket.Node node = bucket.head;
                while (node != null) {
                    put(node.value.key, node.value.value);
                    node = node.next;
                }
            }
        }
    }

    public V put(K key, V value) {
        if (size >= buckets.length * LOAD_FACTOR) {
            recalculate();
        }
        int index = calculateBucketIndex(key);
        Bucket bucket = buckets[index];
        if (bucket == null) {
            bucket = new Bucket();
            buckets[index] = bucket;
        }

        Entity entity = new Entity();
        entity.key = key;
        entity.value = value;

        V buf = bucket.add(entity);
        if (buf == null) {
            size++;
        }
        return buf;
    }

    public V get(K key) {
        int index = calculateBucketIndex(key);
        Bucket bucket = buckets[index];
        if (bucket == null)
            return null;
        return bucket.get(key);
    }

    public V remove(K key) {
        int index = calculateBucketIndex(key);
        Bucket bucket = buckets[index];
        if (bucket == null)
            return null;
        V buf = bucket.remove(key);
        if (buf != null) {
            size--;
        }
        return buf;
    }

    public HashMap() {
        buckets = new HashMap.Bucket[INIT_BUCKET_COUNT];
    }

    public HashMap(int initCount) {
        buckets = new HashMap.Bucket[initCount];
    }


}
