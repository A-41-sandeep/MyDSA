package dsaclass;

import java.util.Arrays;
import java.util.Scanner;

public class TimeInterval {
    int start;
    int end;
    public TimeInterval(int start,int end)
    {
        this.end=end;
        this.start=start;
    }
}

class ExecutionClass
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        TimeInterval arr[]=new TimeInterval[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the start and end time of your department");
            arr[i]=new TimeInterval(s.nextInt(),s.nextInt());
        }
        boolean f=ExecutionClass.canAttendMeeting(arr);
        if(f)
        {
            System.out.println("clashes");
        }
        else
            System.out.println("No clashes");

    }

    public static boolean canAttendMeeting(TimeInterval arr[])
    {
        int start[]=new int[arr.length];
        int end[]=new int[arr.length];
        int i=0;
        for (TimeInterval obj:arr) {
            start[i]= obj.start;
            end[i]=obj.end;
            i++;
        }
        Arrays.sort(start);
        Arrays.sort(end);

        for (int j = 0; j < start.length-1; j++) {
            if(end[j]>=start[j+1])
            {
                return true;
            }
        }
        return false;
    }
}
