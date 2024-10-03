import java.util.ArrayList;
import java.util.List;

public class InClassOct3{

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root.left != null){
            res.addAll(inorderTraversal(root.left));
        } 
        res.add(root.val);
        if(root.right != null){
            res.addAll(inorderTraversal(root.left));
        } 
        
        return res;

    }

}