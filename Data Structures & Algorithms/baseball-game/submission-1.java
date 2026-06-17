class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<>();

        for(String s:operations){
            if(s.equals("+")){
                int top = scores.pop();
                int newTop = top + scores.peek();
                scores.add(top);
                scores.add(newTop);
            } else if(s.equals("D")){
                scores.add(Integer.valueOf(scores.peek())*2);
            } else if(s.equals("C")){
                scores.pop();
            } else{
                scores.add(Integer.valueOf(s));
            }
        }

        int sum = 0;

        
        return scores.stream().mapToInt(Integer::intValue).sum();
    }
}