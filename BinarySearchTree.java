package dsaclass.binarytree;

import java.util.Objects;
import java.util.Scanner;

public class BinarySearchTree {
    static TreeNode<Integer> root;
    static boolean flag=false;
   //insertion
    public static TreeNode<Integer> insert(TreeNode<Integer> root,int value)
    {
         if(root==null)
         { root=new TreeNode<>(value);
             return root;}

         if(value< root.data)
                  root.leftnode=insert(root.leftnode,value);
              else
                  root.rightnode=insert(root.rightnode,value);
         return root;

    }
//Traversal
    public static void preTraversal(TreeNode root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preTraversal(root.leftnode);
        preTraversal(root.rightnode);
    }
    //seraching
    public static boolean search(TreeNode<Integer>root,int value) {
        if (root == null) {
            return false;
        }

        if (root.data == value)
            return true;
        if (value < root.data)
            return search(root.leftnode, value);
       else
        return  search(root.rightnode, value);
    }
    //sum of nodes
    public static int sum(TreeNode<Integer> root)
    {
        if(root==null)
            return 0;
        int leftsum=sum(root.leftnode);
        int rsum=sum(root.rightnode);
        return leftsum+rsum+root.data;

    }
    public static boolean  isPrime(int data)
    {
        if(data==1)
            return false;
       for(int  i=2;i<=data/2;i++)
       {
           if(data%i==0)
               return false;
       }
       return true;
    }

    public static void prime(TreeNode<Integer> root)
    {
        if(root==null)
            return;
        if(isPrime(root.data)) {
            System.out.print(root.data + "->");
            if (root.leftnode != null)
                System.out.print(root.leftnode.data + ", ");
            else
                System.out.print("null," + " ");
            if (root.rightnode != null)
                System.out.println(root.rightnode.data);
            else
                System.out.println("null,");
        }

        prime(root.leftnode);
        prime(root.rightnode);

    }

}

class TreeDemo1
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BinarySearchTree Tree1 = new BinarySearchTree();
        do {
            System.out.println("menu for operations:-");
            System.out.println("enter a number:\n1.for insertion\n2.for preorder traversal\n3.for searching\n4.for prime numbers\n5.for sum of nodes");
            switch (s.nextInt()) {
                case 1:
                    System.out.println("enter values");
                    String str;
                    do {
                        Tree1.root = Tree1.insert(Tree1.root, s.nextInt());
                        System.out.println("want to add more values:Yes/No");
                        str = s.next();
                    } while (Objects.equals(str, "Yes"));
                    break;
                case 2:
                    Tree1.preTraversal(Tree1.root);
                    break;
                case 3:
                    System.out.println("enter value to be searched");
                    System.out.println(Tree1.search(Tree1.root, s.nextInt()));
                    break;
                case 4:
                    Tree1.prime(Tree1.root);
                    break;
                case 5:
                    System.out.println("\t sum of nodes = " + Tree1.sum(Tree1.root));
                    break;
            }
            System.out.println("\nwant to perform more operations ?true/false");
        }
        while(s.nextBoolean());

  //// BuildBinaryTree tree=new BuildBinaryTree();
   //tree.levelTraversal(Tree1.root);



    }
}
