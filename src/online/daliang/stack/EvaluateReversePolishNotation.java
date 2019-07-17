package online.daliang.stack;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        for(int i=0;i<tokens.length;i++){
            if(Pattern.compile("^[+-]?[0-9]+$").matcher(tokens[i]).find()){
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                switch(tokens[i]){
                    case "+" :
                        stack.push(stack.pop() + stack.pop());
                        break; //可选
                    case "-" :
                        int second = stack.pop();
                        int first = stack.pop();
                        stack.push(first - second);
                        break; //可选
                    //你可以有任意数量的case语句
                    case "*" :
                        stack.push(stack.pop() * stack.pop());
                        break; //可选
                    case "/" :
                        int secondDiv = stack.pop();
                        int firstDiv = stack.pop();
                        stack.push(firstDiv / secondDiv);
                        break; //可选
                    default : //可选
                        //语句
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] argv){
        String[] test1 = new String[]{"2", "1", "+", "3", "*"};
        String[] test2 = new String[]{"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(test1));
        System.out.println(evalRPN(test2));
    }


}
