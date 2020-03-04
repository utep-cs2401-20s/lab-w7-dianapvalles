import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SortOfSortTester {

    /*
     * Test 1 : tests the behavior of the method when the array is in increasing order
     */
    @Test
    public void testSortOfSort1(){
        int[] nums = {1,2,3,4,5};
        SortOfSort.sortOfSort(nums);
        int[] expected = {3,2,1,4,5};

        assertArrayEquals(expected,nums);
    }

    /*
     * Test 2 : tests the behavior of the method with duplicated values
     */
    @Test
    public void testSortOfSort2(){
        int[] nums = {9,3,2,1,5,0,8,4,2,1,4,4,6,2,3};
        SortOfSort.sortOfSort(nums);
        int[] expected = {6,5,4,3,2,2,0,1,1,2,3,4,4,8,9};

        assertArrayEquals(expected,nums);
    }

    /*
     * Test 3 : tests the behavior of the method with negative values
     */
    @Test
    public void testSortOfSort3(){
        int[] nums = {-1,1,-1,0};
        SortOfSort.sortOfSort(nums);
        int[] expected = {-1,-1,0,1};

        assertArrayEquals(expected,nums);
    }

    /*
     * Test 4 : tests the behavior when the array is empty
     */
    @Test
    public void testSortOfSort4(){
        int[] nums = {};
        SortOfSort.sortOfSort(nums);
        int[] expected = {};

        assertArrayEquals(expected,nums);
    }

    /*
     * Test 5 : tests the behavior when the array has duplicated, negative and positive values
     */
    @Test
    public void testSortOfSort5(){
        int[] nums = {-1,-4,2,4,5,8,8,8,2,-3,-3};
        SortOfSort.sortOfSort(nums);
        int[] expected = {8,5,2,-1,-4,-3,-3,2,4,8,8};

        assertArrayEquals(expected,nums);
    }
}
