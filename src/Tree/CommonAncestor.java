package Tree;

// Find the lowest common ancestor of two given nodes in the tree
public class CommonAncestor {
    public TreeNode findLCA(TreeNode root, TreeNode a, TreeNode b){
        if(root == null)
            return null;

        if(isCover(a, b)) return a;
        if(isCover(b, a)) return b;

        boolean left = isCover(root.left, a);
        boolean right = isCover(root.right, b);

        if(left == right) return root;
        else if(left)return findLCA(root.left, a, b);
        else return findLCA(root.right, a, b);
    }

    public boolean isCover(TreeNode a, TreeNode b){
        if(a == null) return false;
        if(a == b) return true;

        return isCover(a.left, b) || isCover(a.right, b);
    }
}
