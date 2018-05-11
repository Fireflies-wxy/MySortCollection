package SelectSort;

import BubbleSort.BubbleSort;

import java.util.Arrays;

public class SelectSort {

    public static void selectSort(int[] a){
        int min;
        for(int i=0;i<a.length;i++){
            min = i;
            for(int j=i;j<a.length;j++){
                if(a[j]<a[min])
                    min = j;
            }
            swap(a,i,min);
        }
    }

    public static void main(String[] args) {
        int[] a = {3,6,1,7,9,4,5,8,2};
        SelectSort.selectSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void swap(int[] a,int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
