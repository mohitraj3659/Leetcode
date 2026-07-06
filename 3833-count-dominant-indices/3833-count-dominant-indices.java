class Solution {
    public int dominantIndices(int[] nums) {
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            int rightsum=prefix[nums.length-1]-prefix[i];
            if(nums[i]>(rightsum/(nums.length-(i+1)))) count++;
        }
        return count;
    }
}