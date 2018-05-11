package BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] a){
        boolean flag;
        for(int i=0;i<a.length;i++){
            flag = true;
            for(int j = 0 ;j<a.length-1-i&&flag;j++){
                if(a[j+1]<a[j])
                    swap(a,j+1,j);
            }
        }
    }

    public static void swap(int[] a,int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {3,6,1,7,9,4,5,8,2};
        BubbleSort.bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

}
