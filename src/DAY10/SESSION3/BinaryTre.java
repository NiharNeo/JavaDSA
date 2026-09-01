package DAY10.SESSION3;


class Node{

    public static Node root;
    int data;

    Node left , right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}



public class BinaryTre {

    public static void main(String []args){
        Node.root = new Node(10);
        Node.root.left = new Node(20);
        Node.root.right = new Node(30);

        Node.root.left.left= new Node(50);
    }

}
