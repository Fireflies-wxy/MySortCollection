package MergeSort;

import java.util.Arrays;

public class MyMergeSort {

    public static void mergeSort(int[] a){
        sort(a,0,a.length-1);
    }

    public static void sort(int[] a, int low, int high){

        int mid = (low + high)/2;
        if(low<high){
            sort(a,low,mid);
            sort(a,mid+1,high);

            merge(a,low,mid,high);
        }

    }

    public static void merge(int[] a,int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        //把较小的数先移到新数组中
        while (i<=mid&&j<=high){
            if(a[i]<a[j])
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }

        while (i<=mid){
            temp[k++] = a[i++];
        }

        while (j<=high){
            temp[k++] = a[j++];
        }

        for(int n=0;n<temp.length;n++){
            a[low+n] = temp[n];
        }
    }

    public static void main(String[] args) {
        int[] a = {3,6,1,7,9,4,5,8,2};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }
}
