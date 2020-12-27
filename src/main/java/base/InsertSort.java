package base;

import java.util.Arrays;

/**
 *
 *  插入排序
 */
public class InsertSort {
    public static void swap(int[] arr,int i,int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
    public static void insertSort(int arr[]){
        if (arr== null || arr.length < 2){
            return;
        }
        for (int i=1;i<arr.length;i++){
            for (int j=i-1;j>=0 && arr[j]>arr[j+1];j--){
                swap(arr,j,j+1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{
                10, 9, 8, 7, 6, 5, 4, 4, 3, 2, 1, 0
        };
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
