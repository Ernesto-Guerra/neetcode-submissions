class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero = 0;
        int mult = 1;
        int last = 0;

        int [] pre = new int[nums.length];
        int [] pos = new int[nums.length];
        int [] res = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            pre[i] = mult;

            mult *= nums[i];
        }

        mult = 1;

        for(int i = nums.length-1; i>=0; i--){
            pos[i] = mult;

            res[i] = pre[i] * pos[i];
            mult *= nums[i];
        }
        // pre = [1,1,2,8]
        // pos = [48,24,6,1]
        return res;

    }
}  
