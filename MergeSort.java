package sortingandsearching;

public class MergeSort {
    public static void mSort(int arr[],int start,int end)
    {
        if(start<end) {
            int mid = start + ((end - start) / 2);
            mSort(arr, start, mid);
            mSort(arr, mid + 1, end);
            merging(arr,start,mid,end);
        }

}
public static void  merging(int arr[],int start,int mid,int end)
{
  int i=start;
  int j=mid+1;
  int k=start;
  int dup[]=new int[arr.length];
  while(i<=mid && j<=end)
  {
      if(arr[i]<=arr[j])
      {
          dup[k]=arr[i];
          k++;
          i++;
      }
      else
      {
          dup[k]=arr[j];
          k++;
          j++;
      }
  }
  while(i<=mid)
  {
      dup[k]=arr[i];
      k++;
      i++;
  }
    while(j<=end)
    {
        dup[k]=arr[j];
        k++;
        j++;
    }

    for(int m=start;m<=end;m++)
    {
        arr[m]=dup[m];
    }
}

    public static void main(String[] args) {
        int arr[]={1,4,5,3,6,2,2};
        mSort(arr,0,6);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
