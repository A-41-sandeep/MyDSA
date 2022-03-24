package sortingandsearching;

public class BubbleSort {
    public static int[] bSort(int arr[])
    {
        int temp;
        for (int i = 1; i <=arr.length-1; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String args[])
    {
        int arr[]={1,4,2,5,0};
        arr=BubbleSort.bSort(arr);
        for (int i:arr
             ) {
            System.out.print(i+" ");

        }
    }

}
