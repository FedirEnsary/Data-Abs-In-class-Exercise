public class Oct8 {
    class Node{
        Node left;
        int val;
        Node right;
        int min(){
            if(left != null){
                return left.min();
            }
            else return val;
        }

        int max(){
            if(right != null){
                return right.max();
            }
            else return val;
        }
    }
}
