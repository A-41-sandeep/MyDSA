package dsaclass.avltree;

import dsaclass.binarytree.BinarySearchTree;

class AvlNode
{
    public int data;
    public  AvlNode left;
    public AvlNode right;
    public int height;
    public AvlNode(int val)
    {
        height=0;
        data=val;
        left=right=null;
    }
}
public class CreateAVL {
    AvlNode root = null;

    public int balanceFactor(AvlNode root) {
        if (root == null)
            return 0;
        return getHeight(root.left) - getHeight(root.right);
    }

    //RR
    public AvlNode rightRotate(AvlNode root) {
        AvlNode x = root.left;
        AvlNode t2 = x.right;
        x.right = root;
        root.left = t2;
        root.height = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
        x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;

        return x;
    }

    //LL
    public AvlNode leftRotate(AvlNode root) {
        AvlNode x = root.right;
        AvlNode t2 = x.left;
        x.left = root;
        root.right = t2;
        root.height = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
        x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;

        return x;
    }

    //LR case
    public AvlNode leftRightRotate(AvlNode root) {
        root.left = leftRotate(root.left);
        return rightRotate(root);
    }

    //RL case
    public AvlNode rightLeftRotate(AvlNode root) {
        root.right = rightRotate(root.right);
        return leftRotate(root);
    }

    //rotate method
    public AvlNode rotate(AvlNode root)
    {
        if (balanceFactor(root) < -1 && balanceFactor(root.left) < 1) {
            return leftRotate(root);
        }
        if (balanceFactor(root) > 1 && balanceFactor(root.left) > 1)
            return rightRotate(root);
        if (balanceFactor(root) < -1 && balanceFactor(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        if (balanceFactor(root) > 1 && balanceFactor(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        return root;
    }
    public int getHeight(AvlNode root)
    {
        if(root==null)
            return -1;
        return root.height;
    }

    //insertion
    public AvlNode insert(AvlNode root, int data) {
        if (root == null)
            return new AvlNode(data);
        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        root.height = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
        return rotate(root);

}
//traversal in inorder
    public void preTrav(AvlNode root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preTrav(root.left);
        preTrav(root.right);
    }

    //deletion method
    public AvlNode delete(AvlNode root,int val)
    {
        if(root==null || root.data==val)
           return null;

        if(val>root.data)
            root.right=delete(root.right,val);
        if(val<root.data)
            root.left=delete(root.left,val);
        root.height=Math.max(getHeight(root.left),getHeight(root.right))+1;

        return rotate(root);
    }

}

class AvlDemo
{
    public static void main(String[] args) {
        CreateAVL tree = new CreateAVL();
        AvlNode root = null;
        root = tree.insert(root, 0);
        root = tree.insert(root, 1);
        root = tree.insert(root, 2);
        root = tree.insert(root, 3);
        root = tree.insert(root, 4);
        tree.preTrav(root);
        System.out.println();
        System.out.println(root.right.height);
        root=tree.delete(root,1);
        //tree.preTrav(root);
        //System.out.println(root.right.height);


    }
}
