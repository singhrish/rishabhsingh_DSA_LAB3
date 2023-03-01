import java.util.Stack;

public class balancingBrackets {
    
    public static boolean checkBrackets(String input)
    {
        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } 
                else {
                    char top = stack.peek();
                    if(c == '}' && top == '{' ||
                      c == ')' && top =='(' ||
                      c == ']' && top == '['){
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String input = "(){[]{}" ;
        boolean ans = checkBrackets(input) ;
        if(ans)
        {
            System.out.println("The entered String has Balanced Brackets");
        }
        else {       
        System.out.println("The entered String do not contain Balanced Brackets");
            }
    }
}
