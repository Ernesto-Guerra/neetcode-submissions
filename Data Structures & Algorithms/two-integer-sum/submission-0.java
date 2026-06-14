class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> vistos = new HashMap<>();

        for(int i = 0; i<nums.length;i++){
            int busco = target - nums[i];

            if(vistos.containsKey(busco)){
                return new int[]{vistos.get(busco),i};
            }

            vistos.put(nums[i],i);
        }

        return new int[0];
    }
}
