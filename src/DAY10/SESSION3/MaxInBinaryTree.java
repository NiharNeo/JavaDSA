package DAY10.SESSION3;


import java.util.Scanner;

class Nodee{
    int data;
    Nodee left , right;
    Nodee(int data){
        this.data = data;
        this.left = left = right = null;;

    }
}

class BinaryTree2{
    Nodee root;
    public BinaryTree2(){
        root = null;
    }
    void insertthere(int data){
        root = insert(root,data);
    }

    Nodee insert(Nodee root , int data){
        if(root == null){
            return  new Nodee(data);
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }
        if(data> root.data){
            root.right=insert(root.right,data);
        }

        return root;
    }

    int getMax(){
        return findMax(root);
    }
    //DFS
    int findMax(Nodee root){
        if(root==null){
            return 0;
        }
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);
        return  Math.max(root.data,Math.max(leftMax,rightMax));
    }
}

public class MaxInBinaryTree {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BinaryTree2 tree = new BinaryTree2();

        System.out.println("Enter the no of Values");

        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Enter Values");
            int value = sc.nextInt();
            tree.insertthere(value);
        }
        System.out.println(tree.getMax());
    }



}
