import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,6,1,9,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && temp < arr[j]){
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}