import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSortAlgo {
    public static void main(String[] args) {
        int[] input = {6,8,3,5,1};
        for(int i = 0; i < input.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j < input.length; j++){
                if(input[minIndex] > input[j]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                int temp = input[i];
                input[i] = input[minIndex];
                input[minIndex] = temp;
            }
            System.out.println(Arrays.toString(input));
        }
    }
}
