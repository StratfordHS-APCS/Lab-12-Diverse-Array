/**
 * The class from AP problem 2015#1
 *
 * @author (your name)
 * @version (date)
 */
public class DiverseArray
{
    /**
     * Returns the sum of the entries in the one-dimensional array arr.
     * @param arr the array to sum
     * @return the sum of arr
     */
    public static int arraySum( int[] arr )
    {

    }

    /**
     * Returns a one-dimensional array in which the entry at index k is the sum of
     * the entries of row k of the two-dimensional array arr2D.
     * @param arr2D the array to calculate the row sums of.
     * @return an array containing the sum of each row.
     */
    public static int[] rowSums( int[][] arr2D )
    {

    }

    /**
     * Returns true if all rows in arr2D have different row sums;
     * false otherwise.
     * @param arr2D the array to test for diversity.
     * @return true if all rows in arr2D have different row sums
     */
    public static boolean isDiverse( int[][] arr2D )
    {

    }

    /**
     * You do not need to edit the main method.
     * @param args not used.
     */
    public static void main( String[] args )
    {
        int[][] mat1 = {
                {1, 3, 2, 7, 3},
                {10, 10, 4, 6, 2},
                {5, 3, 5, 9, 6},
                {7, 6, 4, 2, 1}
            };
        int[][] mat2 = {
                {1, 1, 5, 3, 4},
                {12, 7, 6, 1, 9},
                {8, 11, 10, 2, 5},
                {3, 2, 3, 0, 6}
            };
        System.out.println("isDiverse(mat1) = " + isDiverse(mat1) + " (should be true)");
        System.out.println("isDiverse(mat2) = " + isDiverse(mat2) + " (should be false)");
    }
}
