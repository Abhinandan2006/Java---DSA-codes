package BinaryTrees;
import java.util.*;
class TreeNode {
    int val;
    TreeNode right;
    TreeNode left;
    TreeNode(int val){
        this.val = val;
        this.right = null;
        this.left = null;
    }
}
public class bt {
    public static TreeNode buildTree(int[] arr, int st, int ed){
        if(st > ed){
            return null;
        }
        int mid = st + (ed - st) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = buildTree(arr, st, mid - 1);
        root.right = buildTree(arr, mid + 1, ed);
        return root;
    }
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                temp.add(curr.val);

                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            list.add(temp);
        }
        return list;
    }
    public static void preOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
        
    }
    public static void postOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.val);
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 8, 10};
        TreeNode root = buildTree(arr, 0, arr.length - 1);
        System.out.println(levelOrder(root));
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        preOrder(root, list1);
        postOrder(root, list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}
