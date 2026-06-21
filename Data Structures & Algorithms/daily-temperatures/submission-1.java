class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int dias;
        Stack <int[]> stack = new Stack<>();
        int[] res = new int[temperatures.length];

        for(int i = 0; i<temperatures.length; i++){
            while(!stack.isEmpty() && stack.peek()[1]<temperatures[i]){
                int[] par = stack.pop();
                res[par[0]] = i - par[0];
            }
            stack.push(new int[]{i,temperatures[i]});
        }

        return res;
    }
}
