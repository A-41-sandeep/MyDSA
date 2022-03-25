package sortingandsearching;

public class SelectionSort {
    public static int[] sSort(int arr[])
    {
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            int position = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[position]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,1,1,4,5,2,98,0,21,3};
        arr=SelectionSort.sSort(arr);
        for (int i:arr
             ) {
            System.out.print(i+" ");

        }
    }
}
