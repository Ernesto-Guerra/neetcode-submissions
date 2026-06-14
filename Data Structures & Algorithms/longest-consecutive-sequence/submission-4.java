class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);

        int max = 1;

        HashSet<Integer> vistos = new HashSet<>();

        for(int r = 0; r<nums.length-1; r++){

            if(nums[r+1] == nums[r]+1 || nums[r+1] == nums[r]){
                vistos.add(nums[r]);
                vistos.add(nums[r+1]);
            }
            else{
                vistos.clear();
            }

            max = Math.max(max,vistos.size());
        }

        return max;
    }
}
