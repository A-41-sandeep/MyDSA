package dsaclass.binarytree;

import com.sun.source.tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode<T>
{
    T data;
    TreeNode<T> leftnode;
    TreeNode <T> rightnode;
    public TreeNode(T data)
    {
        this.data=data;
        leftnode=null;
        rightnode=null;
    }
}


public class BuildBinaryTree {
    //node of tree
    static TreeNode root=null;
    static int index=-1;
    //insert method
    public static TreeNode buildTree(int arr[])
    {
        index++;
        if(arr[index]==-1)
           return null;
       TreeNode<Integer> node=new TreeNode<>(arr[index]);
       node.leftnode=buildTree(arr);
       node.rightnode=buildTree(arr);

       return node;
    }
    //traversal in preorder
    public static void preTraversal(TreeNode root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preTraversal(root.leftnode);
        preTraversal(root.rightnode);
    }
    //traversal in inorder
    public static void inTraversal(TreeNode root)
    {
        if(root==null)
            return;
        inTraversal(root.leftnode);
        System.out.print(root.data+" ");
        inTraversal(root.rightnode);
    }
    //postorder traversal
    public static void postTraversal(TreeNode root)
    {
        if(root==null)
            return;
        postTraversal(root.leftnode);
        postTraversal(root.rightnode);
        System.out.print(root.data+" ");
    }

    //level Traversal
    public static void levelTraversal(TreeNode root)
    {
        if(root==null)
            return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            TreeNode newnode=q.remove();
            if(newnode==null)
            {
                if(q.isEmpty())
                    break;
                else
                {
                    System.out.println();
                    q.add(null);
                }
            }
            else
            {
                System.out.print(newnode.data+" ");
                if(newnode.leftnode!=null)
                    q.add(newnode.leftnode);
                if(newnode.rightnode!=null)
                    q.add(newnode.rightnode);
            }
        }
    }

    //special display
    public void display(TreeNode root)
    {
        if (root==null)
            return;


        System.out.print(root.data+"->"+" ");
        if(root.leftnode!=null)
            System.out.print(root.leftnode.data+" ");
        if(root.rightnode!=null)
            System.out.print(root.rightnode.data + " ");
        System.out.println();

        display(root.leftnode);
        display(root.rightnode);
    }


}


class TreeDemo {
        public static void main(String[] args) {
            int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            BuildBinaryTree Tree = new BuildBinaryTree();
           TreeNode root =Tree.buildTree(arr);
            //Tree.preTraversal(root);
            //Tree.inTraversal(root);
            //Tree.postTraversal(root);
            //Tree.levelTraversal(root);
            Tree.display(root);


        }
    }


