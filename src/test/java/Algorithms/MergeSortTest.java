package Algorithms;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {

    public void callTests(){
        MergeSort mergeSort = new MergeSort();
        int[] preSorted ={15,322,62,17,81};
        int[] sorted = {15,17,62,81,322};

        //sort empty array
        mergeSort.mergeSort(preSorted);
        //make sure it's still empty
        assertEquals(preSorted, sorted);

    }
}
