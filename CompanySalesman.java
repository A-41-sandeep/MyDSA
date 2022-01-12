package dsaclass;

import java.util.Scanner;

class Company
{
    int product[]=new int[3];
    Company(int item1,int item2,int item3)
    {
        product[0]=item1;
        product[1]=item2;
        product[2]=item3;
    }
    int sum()
    {
        return product[0]+product[1]+product[2];
    }
}
    public class CompanySalesman {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            Company arr[]=new Company[3];
            int[] itemsum={0,0,0};
            for(int i=0;i<arr.length;i++)
            {
                System.out.println("enter sales of salesman-"+i+1);
                arr[i]=new Company(s.nextInt(),s.nextInt(),s.nextInt());
                for(int j=0;j<itemsum.length;j++)
                    itemsum[j]+=arr[i].product[j];
            }
            int sum=0;
            for(int i=0;i< arr.length;i++)
            {
                System.out.println("Total sale by salesman-"+(i+1)+" = "+arr[i].sum());
            }

            for(int i=0;i< arr.length;i++)
            {
                System.out.println("Total sales of item-"+(i+1)+" = "+itemsum[i]);
            }
        }
    }


