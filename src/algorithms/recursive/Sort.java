package algorithms.recursive;

public class Sort {

    private static int[] getFirstHalf(int[] data) {
        //TODO : update to get first half of array
        return null;
    }


    private static int[] getSecondHalf(int[] data) {
        //TODO : update to get second half of array
        return null;
    }


    private static void merge(int[] data, int[] left, int[] right) {
        //TODO : update to merge arrays
    }


    public static void mergeSort(int[] data) {
        //TODO : update with algorithm
    }


    private static int partition(int[] data, int low, int high) {
        //TODO: update with partition algorithm
        return high;
    }


    public static void quickSort(int[] data) {
        //TODO : update to call helper method
    }


    private static void quickSort(int[] data, int min, int max) {
        //TODO: update to partition list
    }


    public static void selectionSort(int[] data) {
        selectionSort(data, 0);
    }


    private static void selectionSort(int[] data, int start) {
        int minIndex;

        if(start < data.length - 1){
            minIndex = start;
            for (int i = start + 1; i < data.length; i++)
                if(data[i] < data[minIndex])
                    minIndex = i;

            swap(data, start, minIndex);
            selectionSort(data, start + 1);
        }
    }

    public static void swap(int[] data, int a, int b) {
        int temp = data[a];
        data[a]  = data[b];
        data[b]  = temp;
    }
}
