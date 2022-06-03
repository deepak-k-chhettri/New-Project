package arrays;

public class MaxElement {
    /**
     * 
     * @param arr
     * @return Maximum element of an integer array
     */
    public static int maxElement(int[]arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
