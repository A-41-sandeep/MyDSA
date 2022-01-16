package dsaclass;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class GameE
{
    private String name;
    private int score;
    public GameE(String name,int score)
    {
        this.name=name;
        this.score=score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String toString()
    {
        return "("+name+","+score+")";
    }
}

class cmp implements Comparator<GameE>
{
    @Override
    public int compare(GameE o1, GameE o2) {
         if(o1.getScore()<o2.getScore())
             return 1;
         return -1;
    }
}

public class GameEntry {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<GameE> arr=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("enter name and score");
            arr.add(new GameE(s.next(),s.nextInt()));
        }
        Collections.sort(arr,new cmp());

        System.out.println("highest scores list: ");
        for (GameE i:arr) {
            System.out.println(i);
        }

    }
}
