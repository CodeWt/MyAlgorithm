package base;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 */
public class BubbleSort {
    public static void bubbleSort(int arr[]){
        if (arr == null || arr.length < 2){
            return;
        }
        for (int i=0;i<arr.length -1;i++){
            for (int j=0;j<arr.length - i -1;j++){
                if (arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{
                10, 9, 8, 7, 6, 5, 4, 4, 3, 2, 1, 0
        };
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
