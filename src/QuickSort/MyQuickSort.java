package QuickSort;
import InsertSort.MyInsertSort;

public class MyQuickSort {

    final static int MAXVALUE = 30;

    public static void MyQuickSort(int[] a){
        int low = 0;
        int high = a.length-1;
        QSort(a,low,high);
    }

    public static void QSort(int[] a,int low, int high){
        int pivot;

        if(high - low>MAXVALUE){
            MyInsertSort.MyInsertSort(a);
        }else{
            while(low<high){
                pivot = partition(a,low,high);
                QSort(a,low,pivot-1);
                low = pivot+1; //采用迭代，缩减堆栈深度
            }
        }
    }

    public static int partition(int[] a,int low, int high){
        int pivotkey;

        int mid = low + (high - low)/2;
        if(a[low]>a[high]){
            swap(a,low,high);
        }
        if(a[low]<a[mid]){
            swap(a,low,mid);
        }
        if(a[mid]>a[high]){
            swap(a,mid,high);
        }

        pivotkey = a[low];
        while(low<high){
            while(low<high&&a[high]>=pivotkey){
                System.out.println("high: "+high+" "+"a[high]: "+a[high]);
                high--;
            }

            swap(a, low,high);

            while (low<high&&a[low]<=pivotkey){
                System.out.println("low: "+low+" "+"a[low]: "+a[low]);
                low++;
            }

            swap(a, low,high);
        }
        return low;
    }

    public static void swap(int[] a, int low, int high){
        int temp;
        temp = a[low];
        a[low] = a[high];
        a[high] = temp;
    }

    public static void main(String[] args) {
        MyQuickSort quickSort = new MyQuickSort();
        int[] a ={50,10,90,30,70,40,80,60,20};
        quickSort.MyQuickSort(a);
        for(int i:a){
            System.out.print(i + " ");
        }
    }
}
