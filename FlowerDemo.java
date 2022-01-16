package dsaclass;

import java.util.Scanner;

class Flower{
   private String name;
    private int petal;
    private  float price;
    public Flower(String name,int petal,float price)
    {
        this.name=name;
        this.price=price;
        this.petal=petal;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public void setPetal(int petal) {
        this.petal = petal;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    //getter methods

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getPetal() {
        return petal;
    }
}
public class FlowerDemo {
    public static void main(String[] args) {
        Flower arr[]=new Flower[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("enter name,no of petals and price of flower-"+(i+1));
            arr[i]=new Flower(s.next(),s.nextInt(),s.nextFloat());
        }
        // values of array

        for(int i = 0; i < arr.length; i++) {
            System.out.println("name of flower- "+(i+1)+" is "+arr[i].getName()+"\tNo.of petals= "+arr[i].getPetal()+"\tand price= "+arr[i].getPrice());
        }
    }
}
