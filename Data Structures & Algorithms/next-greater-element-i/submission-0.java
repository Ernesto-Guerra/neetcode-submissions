class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        boolean flag = false;

        for(int j = 0; j<nums1.length; j++){
            int num = nums1[j];
            for(int i = 0; i<nums2.length; i++){
                if(nums2[i] == num && i!=nums2.length-1){
                    flag = true;
                    continue;
                }

                if(flag && nums2[i] > num){
                    nums1[j] = nums2[i]; 
                    break;
                }

                if(i==nums2.length-1){
                    nums1[j] = -1; 
                    break;
                }
            }
            flag = false;
        }

        return nums1;
    }
}