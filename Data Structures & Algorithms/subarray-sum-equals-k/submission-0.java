class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int sum = 0;
        HashMap<Integer,Integer> diferencias = new HashMap<>();
        diferencias.put(0,1);

        for(int n:nums){
            sum += n;
            int diff = sum - k;

            res += diferencias.getOrDefault(diff,0);
            diferencias.put(sum,diferencias.getOrDefault(sum,0)+1);
        }

        return res;
    }
}

/*
[2,1,2,4]
prefix[i] - prefix[j] = k
prefix[j] = prefix[i] - k
*/