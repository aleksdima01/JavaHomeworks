package AlgorithmsHomework2;

public class Main {
    public static void main(String[] args) {
        int[] array = ArrayUtils.prepareArray();
        ArrayUtils.printArray(array);
        PyramidSort.pyramidSort(array);
        ArrayUtils.printArray(array);
    }
}
