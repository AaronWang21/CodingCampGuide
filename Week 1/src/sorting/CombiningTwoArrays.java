package sorting;

import java.util.Arrays;

public class CombiningTwoArrays {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 6};
        int[] arr2 = new int[]{1, 3, 4, 6, 7, 9,};
        System.out.println(Arrays.toString(merge(arr, arr2)));
    }

    public static int[] merge(int[] array, int[] array2) {
        int pointer1 = 0;
        int pointer2 = 0;
        int[] array3 = new int[(array.length + array2.length)];
        for (int i = 0; i < array3.length; i++) {

            if (pointer1 < array.length && pointer2 < array2.length && array[pointer1] < array2[pointer2]) {
                array3[i] = array[pointer1];
                pointer1++;
            }
            else if (pointer1 < array.length && pointer2 < array2.length && array[pointer1] >= array2[pointer2]) {
                array3[i] = array2[pointer2];
                pointer2++;
            }
            else {
                if (pointer1 >= array.length) {
                    array3[i] = array2[pointer2];
                    pointer2++;
                }
                else if (pointer2 >= array2.length) {
                    array3[i] = array[pointer1];
                    pointer1++;
                }
            }
        }
        return array3;
    }
}