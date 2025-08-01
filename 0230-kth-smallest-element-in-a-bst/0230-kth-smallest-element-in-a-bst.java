class Solution {
    int c = 0;  
    int res = 0;

    public void sum(TreeNode root, int k) {
        if (root == null) return;

        sum(root.left, k);
        
        c++;
        if (c == k) {
            res = root.val;
            return;
        }

        sum(root.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {
        sum(root, k);
        return res;
    }
}
