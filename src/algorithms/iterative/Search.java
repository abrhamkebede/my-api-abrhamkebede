package algorithms.iterative;

/****************************************************************
 * This module implements iterative algorithms for array 
 * data structures with integer precision.
 ****************************************************************/

public class Search {

    public static int binarySearch(int[] data, int target){
        //TODO: update with search algorithm
        return 0;
    }


    public static boolean contains(int[] data, int target) {
        return indexOf(data, target) != -1;
    }


    public static int indexOf(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target)
                return i;
        }
        return -1;
    }

}
