class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;

        HashSet<Integer> vistos = new HashSet<>();

        for(int r=0; r<nums.length;r++){
            int num = nums[r];
            
            if(!vistos.contains(num)){
                vistos.add(num);
                nums[l] = num;
                l++;
            } else{
                while(nums[r] == num){
                    r++;
                    if(r>=nums.length) break;
                }
                r--;
                nums[l] = num;
                l++;
            }
            

        }

        return l;
    }
}