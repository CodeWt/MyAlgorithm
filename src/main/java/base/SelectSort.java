package base;

import java.util.Arrays;

/**
 *
 * 选择排序
 */
public class SelectSort {

    public static void selectSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        for (int i=0;i<arr.length - 1;i++){
            int min = i;
            for (int j=i + 1;j<arr.length;j++){
                min = arr[min] < arr[j]  ? min : j;
            }
            swap(arr,min,i);
        }
    }

    private static void swap(int[] arr, int min, int i) {
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{
                10, 9, 8, 7, 6, 5, 4, 4, 3, 2, 1, 0
        };
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println(Arrays.toString(arr));;
    }

}
