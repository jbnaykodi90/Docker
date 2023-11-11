import java.util.Arrays;

public class TestInsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,6,1,9,2};
        for(int i = 1 ; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j >=0 && arr[j] > key){
                arr[j+1] = arr[j];
                arr[j] = key;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
