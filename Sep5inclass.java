import java.util.Stack;
public class Sep5inclass {

    public static void main(String[] args) {
        String example = "(()[[])";
        System.out.println(isValid(example));
    }

    public static boolean isValid(String s){
        Stack<Character> parentheses = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                parentheses.add('(');
            }
            else if (s.charAt(i) == ')'){
                if(parentheses.isEmpty() || parentheses.pop() != '(') return false;
            }
            else if (s.charAt(i) == '{'){
                parentheses.add('{');
            }
            else if (s.charAt(i) == '}'){
                if(parentheses.isEmpty() || parentheses.pop() != '{') return false;
            }
            else if (s.charAt(i) == '['){
                parentheses.add('(');
            }
            else if (s.charAt(i) == ']'){
                if(parentheses.isEmpty() || parentheses.pop() != '[') return false;
            }
        }
        if (!parentheses.isEmpty()) return false;
        else return true;
    }
}
