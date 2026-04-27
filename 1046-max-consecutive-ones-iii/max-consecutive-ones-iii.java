class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int maxLength = 0;
        int maxFreq = 0;
        int[] hash = new int[2];
        int n = nums.length;
        int one_count = 0;

        while (r < n){
            int val = nums[r];
            hash[val]++;
            maxFreq = Math.max(maxFreq, hash[val]);
            one_count = hash[1];
            while((r -l + 1) - one_count > k){
                int val2 = nums[l];
                hash[val2]--;
                l++;

            }

            maxLength = Math.max(maxLength, r-l+1);
            r++;

        }
        

        return maxLength;
    }
}