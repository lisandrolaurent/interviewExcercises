// Recursive Java program for level
// order traversal of Binary Tree
 
/* Class containing left and right child of current
   node and key value*/
class Node
{
    int data;
    Node left, right;
    public Node(int item){
        data = item;
        left = right = null;
    }
}
 
class BinaryTree
{
    // Root of the Binary Tree
    Node root;
 
    public BinaryTree()
    {
        root = null;
    }
 
    /* function to print level order traversal of tree*/
    public void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printCurrentLevel(root, i);
    }
 
    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    private int height(Node root)
    {
        if (root == null)
           return 0;
        else{
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            return Math.max(lheight,rheight) +1;
        }
    }
 
    /* Print nodes at the current level */
    private void printCurrentLevel (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printCurrentLevel(root.left, level-1);
            printCurrentLevel(root.right, level-1);
        }
    }
     
    /* Driver program to test above functions */
    public static void main(String args[])
    {
       BinaryTree tree = new BinaryTree();
       tree.root= new Node(1);
       tree.root.left= new Node(2);
       tree.root.right= new Node(3);
       tree.root.left.left= new Node(4);
       tree.root.left.right= new Node(5);
        
       /*

            1
           / \
          2   3
         / \
        4   5
       
       */     

       System.out.println("Level order traversal of binary tree is");
       tree.printLevelOrder();
    }
}

/*

Time Complexity: 
O(n^2) in worst case. 
For a skewed tree, printGivenLevel() takes O(n) time where n is the number of nodes in the skewed tree.
So time complexity of printLevelOrder() is O(n) + O(n-1) + O(n-2) + .. + O(1) which is O(n^2). 

Space Complexity:
O(n) in worst case.
For a skewed tree, printGivenLevel() uses O(n) space for call stack.
For a Balanced tree, the call stack uses O(log n) space, (i.e., the height of the balanced tree). 

*/