class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int resultado = 0;
        int first = 0;

        for(String s:tokens){
            switch(s){
                case "+":
                    resultado = stack.pop() + stack.pop();
                    stack.push(resultado);
                    break; 
                case "-":
                    first = stack.pop();
                    resultado = stack.pop() - first;
                    stack.push(resultado);
                    break; 
                case "*":
                    resultado = stack.pop() * stack.pop();
                    stack.push(resultado);
                    break; 
                case "/":
                    first = stack.pop();
                    resultado = stack.pop() / first;
                    stack.push(resultado);
                    break; 
                default:
                    stack.push(Integer.valueOf(s));
                    break;
            }
            System.out.println(stack);
        }

        return stack.pop();
    }
}
