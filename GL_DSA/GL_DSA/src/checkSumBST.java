class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class checkSumBST {

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        
            if (root == null)
                return false;
            
         else if (root.left == null && root.right == null && targetSum - root.val == 0)
         {  return true ;   }
            
            else 
                return 
            (hasPathSum(root.left, targetSum - root.val ) ||
                hasPathSum(root.right, targetSum - root.val )) ;
        }

        public static void main(String[] args) {
            TreeNode root = new TreeNode(40);
            root.left = new TreeNode(20);
            root.right = new TreeNode(60);
            root.left.left = new TreeNode(10);
            root.left.right = new TreeNode(30);
            root.right.left = new TreeNode(50);
            root.right.right = new TreeNode(70);

            int target = 130 ;
            
            boolean ans = hasPathSum(root, target) ;
            if(ans) {
                         System.out.println("Nodes are found");
                    }
                    else
                    {
                        System.out.println("Nodes are not found");

                    }
        }
}
