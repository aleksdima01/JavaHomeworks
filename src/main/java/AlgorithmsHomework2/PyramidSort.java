package AlgorithmsHomework2;

public class PyramidSort {

    public static void pyramidSort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            pyramid(array, array.length, i);
        }
        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            pyramid(array, i, 0);
        }
    }

    public static void pyramid(int[] array, int heapSize, int rootIndex) {
        int parent = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < heapSize && array[leftChild] > array[parent])
            parent = leftChild;

        if (rightChild < heapSize && array[rightChild] > array[parent])
            parent = rightChild;

        if (parent != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[parent];
            array[parent] = temp;
            pyramid(array, heapSize, parent);
        }
    }
}
