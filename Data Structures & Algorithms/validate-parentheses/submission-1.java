class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){

            if(c == '[' || c == '(' || c == '{'){
                stack.push(c);
            } else{
                if(stack.isEmpty()){
                    return false;
                }
                char before;
                switch(c){
                    case ']':
                        before = '[';
                        break;
                    case ')':
                        before = '(';
                        break;
                    case '}':
                        before = '{';
                        break;
                    default:
                        before = '0';
                        break;
                }

                if(stack.peek() == before){
                    stack.pop();
                }
                else{
                    return false;
                }

            }
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
