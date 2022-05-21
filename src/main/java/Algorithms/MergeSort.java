package Algorithms;

public class MergeSort {

    public static void mergeSort(int[] array){
        mergeSort(array, new int[array.length],0, array.length-1);
    }

    public static void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd){

        //if the left start is greater or equal to the end of the array, it would be of size 0 or non-existent
        if (leftStart >= rightEnd){
            return;
        }

        //find the middle of the array
        int middle = (rightEnd+leftStart)/2;

        //recursively call mergesort
        //call left side
        mergeSort(array, temp, leftStart, middle);
        //call right side
        mergeSort(array, temp, middle+1, rightEnd);
        //merge the two arrays together
        mergeHalves(array, temp, leftStart, rightEnd);

    }

    public static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd){

        //get the middle of the array to act as the end of the left side
        int leftEnd = (leftStart+rightEnd)/2;
        //right side starts one after middle
        int rightStart = leftEnd+1;
        //total size of the array
        int size = rightEnd-leftStart+1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        //loop through till the end of each array and copy the smallest element to the temp array
        while ((left <= leftEnd) && (right <= rightEnd)){
            //if the left array is smaller than the right array
            if (array[left] <= array[right]){
                //copy the left array element to the temp array
                temp[index] = array[left];
                //move the left pointer
                left++;
            } else {
                //copy the right array element to the temp array
                temp[index]= array[right];
                //move the right pointer
                right++;
            }
            //move the temp array index each time
            index++;
        }

        //at this point we've reached the end of one of the arrays, need to copy over the remaining elements
        //since we've reached out of bounds, one of these will be empty and one will be copied
        System.arraycopy(array, left, temp, index, leftEnd- left+1);
        System.arraycopy(array, right, temp, index, rightEnd- right+1);

        //copy the temp array back to the original array
        System.arraycopy(temp, leftStart, array, leftStart, size);
    }
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void callMergeSort(){
        System.out.println("MERGE SORT:");
        int[] array = {15,322,62,17,81};
        System.out.print("BEFORE: ");
        printArray(array);
        mergeSort(array);
        System.out.print("AFTER: ");
        printArray(array);
    }
}
