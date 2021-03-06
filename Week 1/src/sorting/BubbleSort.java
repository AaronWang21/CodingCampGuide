package sorting;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,5,8,2,3,4,1,9,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] array) {
        int counter = 0;
        int temp = 0;
        for (;;) {
            if(counter == array.length - 1){
                break;
            }
            counter = 0;
            for(int i = 0; i < array.length - 1; i ++ ){
                if (array[i] <= array[i + 1]) {
                    counter += 1;
                }
                else if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
}