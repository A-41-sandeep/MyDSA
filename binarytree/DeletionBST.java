package dsaclass.binarytree;

public class DeletionBST {
    static TreeNode<Integer> root=null;

    public static TreeNode<Integer> insert(TreeNode<Integer> root,int value)
    {
        if(root==null)
        {
            return new TreeNode<>(value);
        }
        if(value<root.data)
            root.leftnode=insert(root.leftnode,value);
        else
            root.rightnode=insert(root.rightnode,value);
        return root;
    }
    public static TreeNode<Integer> delete(TreeNode<Integer> root,int value)
    {
        if(root==null)
            return null;
        if(value<root.data)
            root.leftnode=delete(root.leftnode,value);
        else if(value>root.data)
            root.rightnode=delete(root.rightnode,value);
        else {
            if(root.leftnode==null && root.rightnode==null)
                return null;
            else if(root.leftnode==null || root.rightnode==null)
            {
                TreeNode<Integer> temp=null;
                temp=root.leftnode==null?root.rightnode:root.leftnode;
                return temp;
            }
            else
            {
                TreeNode<Integer> successor=findSuccessor(root.rightnode);
               root.rightnode=delete(root.rightnode,successor.data);
               return successor;
            }
        }
        return root;
    }
    //successor method
    public static TreeNode<Integer> findSuccessor(TreeNode<Integer> root)
    {
        if(root==null)
            return null;
        TreeNode<Integer> temp=root;
        while(temp.leftnode!=null)
        {
            temp=temp.leftnode;
        }
        return temp;
    }
}
class DemoBST
{
    public static void main(String[] args) {
        int[] arr={8,1,4,9,10,13,6,2,15};
        DeletionBST tree2=new DeletionBST();
        BinarySearchTree tree=new BinarySearchTree();
        for(int i:arr)
        {
            tree2.root=tree2.insert(tree2.root,i);
        }
        tree.preTraversal(tree2.root);
        tree2.delete(tree2.root,8);
        System.out.println();
        tree.preTraversal(tree2.root);
    }
}
