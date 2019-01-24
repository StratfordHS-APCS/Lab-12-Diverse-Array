

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DiverseArrayTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DiverseArrayTest
{
    private int[][] mat1 = {
                {1, 3, 2, 7, 3},
                {10, 10, 4, 6, 2},
                {5, 3, 5, 9, 6},
                {7, 6, 4, 2, 1}
            };
    private int[][] mat2 = {
                {1, 1, 5, 3, 4},
                {12, 7, 6, 1, 9},
                {8, 11, 10, 2, 5},
                {3, 2, 3, 0, 6}
            };
    private int[] mat1sums = { 16, 32, 28, 20 };
    private int[] mat2sums = { 14, 35, 36, 14 };

    
    /**
     * arraySum test.
     */
    @Test(timeout=2000)
    public void arraySumTest()
    {
        for( int i = 0; i < mat1.length; i++ )
        {
            assertEquals("arraySum() failed on row " + i + " of mat1.", mat1sums[i], DiverseArray.arraySum(mat1[i]) );
        }
        
        for( int i = 0; i < mat2.length; i++ )
        {
            assertEquals("arraySum() failed on row " + i + " of mat2.", mat2sums[i], DiverseArray.arraySum(mat2[i]) );
        }
    }
    
    /**
     * rowSums test.
     */
    @Test(timeout=2000)
    public void rowSumsTest()
    {
        assertArrayEquals("rowSums() failed on mat1.", mat1sums, DiverseArray.rowSums(mat1) );
        assertArrayEquals("rowSums() failed on mat2.", mat2sums, DiverseArray.rowSums(mat2) );
    }
    
    /**
     * isDiverse Test
     */
    @Test(timeout=2000)
    public void isDiverseTest()
    {
        assertEquals("isDiverse() failed on mat1.", true, DiverseArray.isDiverse(mat1) );
        assertEquals("isDiverse() failed on mat2.", false, DiverseArray.isDiverse(mat2) );
    }
}
