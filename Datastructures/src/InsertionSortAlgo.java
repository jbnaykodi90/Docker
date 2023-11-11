import java.util.Arrays;

public class InsertionSortAlgo {
    public static void main(String[] args) {
        int[] input = {6,8,3,5,1};
        for(int i = 1; i < input.length; i++){
            int key = input[i];
            int j = i - 1;
            while(j >= 0 && input[j] > key){
                input[j+1] = input[j];
                input[j] = key;
                j--;
            }
            System.out.println(Arrays.toString(input));
        }
    }
}
