package HeapSort;

import java.util.Arrays;

public class HeapSort {

    public static void heapSort(int[] a){
        int i;
        for(i = a.length/2-1;i>=0;i--){
            adjustHeap(a,i,a.length-1);
        }

        for(i=a.length-1;i>=0;i--){
            swap(a,0,i);
            adjustHeap(a,0,i-1);
        }
    }

    public static void adjustHeap(int[] a, int s ,int m){
        int temp,j;
        temp = a[s];
        System.out.println("s: "+s);
        for(j=2*s+1;j<m;j*=2+1){
            if(j<m&&a[j]<a[j+1])
                ++j;
            if(temp>a[j])
                break;
            a[s] = a[j];
            s = j;
        }
        a[s] = temp;
    }

    public static void swap(int[] a,int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {5,1,9,3,7,4,8,6,2};
        HeapSort.heapSort(a);
        System.out.println(Arrays.toString(a));
    }


}
