package sortingandsearching;

public class InsertionSort {
    public static int[] iSort(int arr[])
    {
        for(int i=1;i< arr.length;i++)
        {
            int ele=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>ele)
            {
                arr[j + 1] = arr[j];
                arr[j] = ele;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={0,3,1,3,2,28,4,7,0};
        arr=InsertionSort.iSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
