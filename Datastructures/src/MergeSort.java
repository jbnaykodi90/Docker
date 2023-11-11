import java.util.Arrays;

public class MergeSort {

    public static void conqure(int[] arr, int startingIndex, int mid, int endingIndex){
        //Create temporary array to merge the elements
        int[] mergedArray = new int[endingIndex-startingIndex+1];
        //Index to process first part of the array
        int index1 = startingIndex;
        //Index to process second part of the array
        int index2 = mid+1;
        //Index to process final array to copy results from two parts
        int mainIndex = 0;

        //iterate and merge elements till both the arrays have elements and exit if only one array has left with some elements
        while(index1 <= mid && index2 <= endingIndex){
            if(arr[index1] <= arr[index2]){
                mergedArray[mainIndex++] = arr[index1++];
            }else{
                mergedArray[mainIndex++] = arr[index2++];
            }
        }

        //Merge remaining elements from array 1
        while(index1 <= mid){
            mergedArray[mainIndex++] = arr[index1++];
        }

        //Merge remaining elements from array 2
        while(index2 <= endingIndex){
            mergedArray[mainIndex++] = arr[index2++];
        }

        //Copy elements from temporary array to original array
        for(int i = 0, j = startingIndex; i < mergedArray.length; i++, j++){
            arr[j] = mergedArray[i];
        }
    }

    public static void divide(int[] arr, int startingIndex, int endingIndex){
        //Anytime if starting index is greater than or equals to ending index then no need to divide array further
        if(startingIndex >= endingIndex){
            return;
        }
        //Calculate mid index using starting and ending index
        int mid = (startingIndex + endingIndex) /2;
        //divide array further from starting index till mid of the array
        divide(arr, startingIndex, mid);
        //divide array further from mid+1 index till end of the array
        divide(arr, mid + 1, endingIndex);
        //Post array is divided till base level start merging.
        conqure(arr, startingIndex, mid, endingIndex);
    }

    public static void main(String[] args) {
        int[] input = {6,8,3,5,1};
        divide(input, 0, input.length-1);
        System.out.println(Arrays.toString(input));
    }
}
