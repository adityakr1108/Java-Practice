public class binaryTree{
static class Node{
    int data;
    Node left;
    Node right;
    Node (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

static int idx = -1;
public static Node buildTree(int node[]){
    idx++;
    if(node[idx] == -1){
        return null;
    }
    Node build = new Node(node[idx]);
    build.left = buildTree(node);
    build.right = buildTree(node);
    return build;
}
public static void inorder(Node root){
    if(root == null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
}
public static void preorder(Node root){
    if(root==null){
        return;
    }
     System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
}
public static void postorder(Node root){
    if(root==null){
        return;
    }
    preorder(root.left);
    preorder(root.right);
    System.out.print(root.data + " ");
}

public static void main(String[] rgs){
    int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    binaryTree tree = new binaryTree();
    Node root = tree.buildTree(nodes);
   System.out.println(root.data);
    tree.inorder(root);
    System.out.println();
    tree.preorder(root);
    System.out.println();
    tree.postorder(root);
}

}