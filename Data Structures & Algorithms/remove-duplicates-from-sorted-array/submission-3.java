class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int last = Integer.MIN_VALUE;

        for(int r = 0; r<nums.length;r++){

            if(nums[r] == last){
                continue;
            }
            nums[l] = nums[r];
            last = nums[r];
            l++;
        }

        return l;
    }
}