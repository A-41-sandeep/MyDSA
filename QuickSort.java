package sortingandsearching;

public class QuickSort {
    public static void qSort(int[] arr,int start,int end)
    {
        if(start<end)
        {
            int pivot=partiton(arr,start,end);
            qSort(arr,start,pivot-1);
            qSort(arr,pivot+1,end);
        }
    }
    public static int partiton(int arr[],int start,int end)
    {
        int pivot=arr[end];
        int i=start,j=start-1;
        while(i<=end)
        {

            if(arr[i]<=pivot)
            {
                j++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
            i++;

        }
         return j;
    }

    public static void main(String[] args) {
        int arr[]={1,0,3,9,9,7,5,1,0};
        qSort(arr,0,8);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
