class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<>();

        for(String s:operations){
            if(s.equals("+")){
                int top = scores.pop();
                int newTop = top + scores.peek();
                scores.push(top);
                scores.push(newTop);
            } else if(s.equals("D")){
                scores.push(Integer.valueOf(scores.peek())*2);
            } else if(s.equals("C")){
                scores.pop();
            } else{
                scores.push(Integer.valueOf(s));
            }
        }
        
        return scores.stream().mapToInt(Integer::intValue).sum();
    }
}