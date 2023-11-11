import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high){
        //below condition makes sure that elements in the array should be more than one
        //if there is only one element remaining then low and high will be equal and
        //further sorting will not happen
        if(low < high){
            //find out right position of pivot element
            int pivot = partition(arr,low,high);
            //sort elements before pivot element
            quickSort(arr,low, pivot-1);
            //sort elements after pivot element
            quickSort(arr,pivot+1,high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        //Always point to the last element in the array
        int pivot = arr[high];
        //initialized to low-1, it is flag used to move all elements less than pivot
        int i = low-1;
        //iterate from lower element of array to higher element of array
        for(int j = low; j < high; j++){
            //if current element value is less than pivot then increment i
            // which means make space for small elements than pivot and swap current
            //element with i which is newly created space
            if(arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //At last when all small elements are moved using i,
        //create space to place pivot element by increment i and swap it
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        //i indicate position of pivot element which needs to be returned
        return i;
    }

    public static void main(String[] args) {
        int[] input = {6,8,3,5,1};
        quickSort(input, 0 , input.length-1);
        System.out.println(Arrays.toString(input));
    }
}
