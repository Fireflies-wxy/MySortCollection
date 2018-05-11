package InsertSort;

public class MyInsertSort {

    public static void MyInsertSort(int[] a){

        int length = a.length;
        int i;

        for(i=1;i<length;i++){
            int insertNum = a[i];
            int j =i-1;
            while (j>=0&&a[j]>insertNum){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = insertNum;
        }
    }

    public static void main(String[] args) {

        MyInsertSort insertSort = new MyInsertSort();
        int[] a ={1,3,6,8,2,33,12,23};
        insertSort.MyInsertSort(a);

        for(int i:a){
            System.out.print(i + " ");
        }
    }
}
