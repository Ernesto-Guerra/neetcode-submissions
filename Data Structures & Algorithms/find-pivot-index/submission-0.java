class Solution {
    public int pivotIndex(int[] nums) {
        int[] izq = new int[nums.length];
        int[] der = new int[nums.length];

        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i<nums.length;i++){
            izq[i] = sum;
            der[nums.length-1-i] = sum2;
            sum+= nums[i];
            sum2+= nums[nums.length-1-i];
        }
        
        for(int i = 0; i<nums.length;i++){
            if(izq[i] == der[i]){
                return i;
            }
        }
        return -1;

    }
}

/*
izq [0,1,8,11,17,22]
der [27,20,17,11,6,0]
*/