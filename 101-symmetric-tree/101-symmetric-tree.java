/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean areMirrorImage(TreeNode r1,TreeNode r2)
    {
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        
        return (r1.val == r2.val) && areMirrorImage(r1.left, r2.right) && areMirrorImage(r1.right, r2.left);

        
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return areMirrorImage(root.left,root.right);
    }
}



// we can also use iteration with the aid of a queue. Each two consecutive nodes in the queue should be equal, and their subtrees a mirror of each other. Initially, the queue contains root and root. Then the algorithm works similarly to BFS, with some key differences. Each time, two nodes are extracted and their values compared. Then, the right and left children of the two nodes are inserted in the queue in opposite order. The algorithm is done when either the queue is empty, or we detect that the tree is not symmetric (i.e. we pull out two consecutive nodes from the queue that are unequal).