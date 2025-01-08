import java.util.*;
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
public static void levelOrder(Node root){
    if(root == null){
        return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty()){
        Node temp = q.remove();
        if(temp == null){
            System.out.println();
            if(q.isEmpty()){
                break;
            } else{
                q.add(null);
            }
        }
        else{
            System.out.print(temp.data + " ");
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }   
        }
    }
}

public static int height(Node root){
    if(root == null){
        return 0;
    }
    int height = 1 + Math.max(height(root.left), height(root.right));
    return height;
}

public static void main(String[] args){
    int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    binaryTree tree = new binaryTree();
    Node root = tree.buildTree(nodes);
   System.out.println(root.data);
    tree.inorder(root);
    System.out.println();
    tree.preorder(root);
    System.out.println();   
    tree.postorder(root);
    System.out.println();
    tree.levelOrder(root);
    
    System.out.println(tree.height(root));

}

}