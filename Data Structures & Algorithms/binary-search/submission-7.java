class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

        while(l<=r){
            int i = (r+l)/2;
            System.out.println(i);
            int actual = nums[i];

            if(actual == target){
                return i;
            }

            if(actual<target){
                l=i+1;
            } else{
                r=i-1;
            }
        }
        return -1;
    }
}
